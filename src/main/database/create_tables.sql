CREATE SEQUENCE public.events_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 6
  CACHE 1;

CREATE TABLE public.events
(
  eventname character varying,
  city character varying,
  dance character varying NOT NULL,
  id integer NOT NULL DEFAULT nextval('events_id_seq'::regclass),
  price double precision,
  date date,
  CONSTRAINT id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Salsa sralsa', E'Radom', E'salsa', 0, E'2016-09-03');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Tańce na bańce', E'Kraków', E'dancehall', 175, E'2016-09-07');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Tango bajer', E'Szczecin', E'tango', 150, E'2016-09-01');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Salsa fun', E'Warszawa', E'salsa', 200, E'2016-09-02');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Tango Balango', E'Wrocław', E'tango', 100, E'2016-09-03');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Jamaica!!!', E'Bydgoszcz', E'ragga', 200, E'2016-09-04');
INSERT INTO "public"."events" ("eventname", "city", "dance", "price", "date") VALUES (E'Wielkie Love', E'Warszawa', E'towarzyski', 0, E'2016-09-05');