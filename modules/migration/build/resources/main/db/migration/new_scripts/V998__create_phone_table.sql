Drop table if exists phone;

CREATE TABLE phone (
	id Serial,
	brandName character varying (50),
	color character varying (50),
	internalStorage integer,
	ramMemory integer,
	createdDate timestamp without time zone DEFAULT now(),
	modifiedBy integer DEFAULT NULL,
	lastUpdatedDate timestamp without time zone DEFAULT now(),

	 	CONSTRAINT phone_pkey PRIMARY KEY (id),

		CONSTRAINT phone_users_fkey FOREIGN KEY (modifiedBy)
        REFERENCES public.users (id) MATCH SIMPLE

        ON UPDATE CASCADE
        ON DELETE CASCADE
);