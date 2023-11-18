CREATE TABLE ticket (
    id INT GENERATED ALWAYS AS IDENTITY,
    created_at TIMESTAMP WITH TIME ZONE,
    client_id INT,
    from_planet_id VARCHAR,
    to_planet_id VARCHAR,
    CONSTRAINT ticket__client_fk FOREIGN KEY (client_id) REFERENCES client(id),
    CONSTRAINT ticket__from_planet_fk FOREIGN KEY (from_planet_id) REFERENCES planet(id),
    CONSTRAINT ticket__to_planet_fk FOREIGN KEY (to_planet_id) REFERENCES planet(id)
);