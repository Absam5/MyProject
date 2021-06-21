Drop table if exists distribution_services;

CREATE TABLE distribution_services (
	id Serial,
	supplier character varying (50),
	receiver integer,
	createdDate timestamp without time zone DEFAULT now(),
	status character varying (30),
	modifiedBy integer DEFAULT NULL,
	lastUpdatedDate timestamp without time zone DEFAULT now(),

	 	CONSTRAINT distribution_services_pkey PRIMARY KEY (id),

		CONSTRAINT distribution_services_users_fkey FOREIGN KEY (id)
        REFERENCES public.users (id) MATCH SIMPLE

        ON UPDATE CASCADE
        ON DELETE CASCADE
);
