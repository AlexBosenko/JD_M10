CREATE TABLE IF NOT EXISTS client (
    id INT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) BETWEEN 3 AND 200),
    PRIMARY KEY (id)
);