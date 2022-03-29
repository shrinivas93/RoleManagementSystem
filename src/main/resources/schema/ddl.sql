CREATE TABLE action
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE resource
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE permission
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR NOT NULL,
    action_id   INT REFERENCES action (id),
    resource_id INT REFERENCES resource (id)
);

CREATE TABLE role
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE role_permission
(
    id            SERIAL PRIMARY KEY,
    role_id       INT REFERENCES role (id),
    permission_id INT REFERENCES permission (id)
);

CREATE TABLE rms_user
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE rms_user_role_assignment
(
    id          SERIAL PRIMARY KEY,
    rms_user_id INT REFERENCES rms_user (id),
    role_id     INT REFERENCES role (id)
);