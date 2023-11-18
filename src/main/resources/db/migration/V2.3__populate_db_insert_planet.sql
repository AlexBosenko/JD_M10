INSERT INTO ticket(created_at, client_id, from_planet_id, to_planet_id)
VALUES
    ('2012-03-01'::TIMESTAMP, 1, 'MARS2', 'VENU1'),
    ('2015-04-28'::TIMESTAMP, 2, 'VENU1', 'NEPT5'),
    ('2021-12-31'::TIMESTAMP, 3, 'JUPI4', 'NEPT5'),
    ('2023-01-01'::TIMESTAMP, 4, 'SATU3', 'JUPI4'),
    ('2010-07-25'::TIMESTAMP, 5, 'NEPT5', 'MARS2'),
    ('2016-05-22'::TIMESTAMP, 2, 'NEPT5', 'VENU1'),
    ('2022-02-27'::TIMESTAMP, 3, 'NEPT5', 'SATU3'),
    ('2023-09-30'::TIMESTAMP, 7, 'JUPI4', 'MARS2'),
    ('2016-10-16'::TIMESTAMP, 8, 'MARS2', 'JUPI4'),
    ('2022-11-21'::TIMESTAMP, 3, 'SATU3', 'JUPI4')