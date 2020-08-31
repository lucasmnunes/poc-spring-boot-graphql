INSERT INTO country (id, name, continent) VALUES (1, 'Spain', 'Europe');
INSERT INTO country (id, name, continent) VALUES (2, 'Portugal', 'Europe');
INSERT INTO country (id, name, continent) VALUES (3, 'France', 'Europe');
INSERT INTO country (id, name, continent) VALUES (4, 'England', 'Europe');
INSERT INTO country (id, name, continent) VALUES (5, 'Brazil', 'South America');

INSERT INTO player (id, id_country, name, position, jersey_number, birth)
    VALUES (1, (SELECT id FROM country WHERE name = 'Spain'), 'Iker Casillas', 'Goalkeeper', 1, '2020-01-01');

INSERT INTO player (id, id_country, name, position, jersey_number, birth)
    VALUES (2, (SELECT id FROM country WHERE name = 'Spain'), 'Michel Salgado', 'Defender', 2, '2020-01-01');

-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (3, 'Fernando Hierro Carlos', 'Spain', 'Defender', 4, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (4, 'Ivan Helguera', 'Spain', 'Defender', 6, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (5, 'Roberto Carlos', 'Brazil', 'Defender', 3, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (6, 'Guti', 'Spain', 'Midfielder', 14, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (7, 'Zinedine Zidane', 'France', 'Midfielder', 5, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (8, 'David Beckham', 'England', 'Midfielder', 23, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (9, 'Luis Figo', 'Portugal', 'Midfielder', 10, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (10, 'Raul', 'Spain', 'Attacker', 7, '2020-01-01');
--
-- INSERT INTO player (id, name, country, position, jersey_number, birth)
--     VALUES (11, 'Ronaldo', 'Brazil', 'Attacker', 9, '2020-01-01');
