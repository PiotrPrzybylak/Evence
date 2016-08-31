CREATE TABLE "events" (
	"id" SERIAL NOT NULL,
	"eventname" VARCHAR NULL DEFAULT NULL,
	"city" VARCHAR NULL DEFAULT NULL,
	"date" VARCHAR NULL DEFAULT NULL,
	"price" DOUBLE PRECISION NOT NULL DEFAULT E'true',
	"dance" VARCHAR NOT NULL,
	PRIMARY KEY ("id")
)
;
COMMENT ON COLUMN "events"."id" IS E'';
COMMENT ON COLUMN "events"."eventname" IS E'';
COMMENT ON COLUMN "events"."city" IS E'';
COMMENT ON COLUMN "events"."date" IS E'';
COMMENT ON COLUMN "events"."price" IS E'';
COMMENT ON COLUMN "events"."dance" IS E'';
