/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     14/03/2025 6:06:50 p.�m.                     */
/*==============================================================*/



/*==============================================================*/
/* Table: CONSULTA                                              */
/*==============================================================*/
create table CONSULTA (
   ID_CONSULTA          VARCHAR(10)          not null,
   ID_SEDE              VARCHAR(5)           not null,
   CEDULA_VETERINARIO   VARCHAR(10)          not null,
   ID_VACUNA            VARCHAR(5)           not null,
   FECHA_CONSULTA       DATE                 not null,
   constraint PK_CONSULTA primary key (ID_CONSULTA)
);

/*==============================================================*/
/* Index: CONSULTA_PK                                           */
/*==============================================================*/
create unique index CONSULTA_PK on CONSULTA (
ID_CONSULTA
);

/*==============================================================*/
/* Index: SEDE_CONSULTA_FK                                      */
/*==============================================================*/
create  index SEDE_CONSULTA_FK on CONSULTA (
ID_SEDE
);

/*==============================================================*/
/* Index: VETERINARIO_CONSULTA_FK                               */
/*==============================================================*/
create  index VETERINARIO_CONSULTA_FK on CONSULTA (
CEDULA_VETERINARIO
);

/*==============================================================*/
/* Index: VACUNA_CONSULTA_FK                                    */
/*==============================================================*/
create  index VACUNA_CONSULTA_FK on CONSULTA (
ID_VACUNA
);

/*==============================================================*/
/* Table: ENCARGADO                                             */
/*==============================================================*/
create table ENCARGADO (
   CEDULA_ENCARGADO     VARCHAR(10)          not null,
   NOMBRE_ENCARGADO     VARCHAR(50)          not null,
   TELEFONO_ENCARGADO   VARCHAR(10)          not null,
   constraint PK_ENCARGADO primary key (CEDULA_ENCARGADO)
);

/*==============================================================*/
/* Index: ENCARGADO_PK                                          */
/*==============================================================*/
create unique index ENCARGADO_PK on ENCARGADO (
CEDULA_ENCARGADO
);

/*==============================================================*/
/* Table: ESPECIE                                               */
/*==============================================================*/
create table ESPECIE (
   ID_ESPCIE            VARCHAR(4)           not null,
   NOM_ESPECIE          VARCHAR(50)          not null,
   constraint PK_ESPECIE primary key (ID_ESPCIE)
);

/*==============================================================*/
/* Index: ESPECIE_PK                                            */
/*==============================================================*/
create unique index ESPECIE_PK on ESPECIE (
ID_ESPCIE
);

/*==============================================================*/
/* Table: ESPECIE_RAZA                                          */
/*==============================================================*/
create table ESPECIE_RAZA (
   ID_RAZA              VARCHAR(4)           not null,
   ID_ESPCIE            VARCHAR(4)           not null,
   constraint PK_ESPECIE_RAZA primary key (ID_RAZA, ID_ESPCIE)
);

/*==============================================================*/
/* Index: ESPECIE_RAZA_PK                                       */
/*==============================================================*/
create unique index ESPECIE_RAZA_PK on ESPECIE_RAZA (
ID_RAZA,
ID_ESPCIE
);

/*==============================================================*/
/* Index: ESPECIE_RAZA2_FK                                      */
/*==============================================================*/
create  index ESPECIE_RAZA2_FK on ESPECIE_RAZA (
ID_ESPCIE
);

/*==============================================================*/
/* Index: ESPECIE_RAZA_RAZA_FK                                  */
/*==============================================================*/
create  index ESPECIE_RAZA_RAZA_FK on ESPECIE_RAZA (
ID_RAZA
);

/*==============================================================*/
/* Table: MASCOTA                                               */
/*==============================================================*/
create table MASCOTA (
   ID_MASCOTA           VARCHAR(5)           not null,
   CEDULA_ENCARGADO     VARCHAR(10)          not null,
   ID_RAZA              VARCHAR(4)           not null,
   ID_ESPCIE            VARCHAR(4)           not null,
   NOMBRE_MASCOTA       VARCHAR(50)          not null,
   EDAD_MASCOTA         NUMERIC(2,0)         not null,
   constraint PK_MASCOTA primary key (ID_MASCOTA)
);

/*==============================================================*/
/* Index: MASCOTA_PK                                            */
/*==============================================================*/
create unique index MASCOTA_PK on MASCOTA (
ID_MASCOTA
);

/*==============================================================*/
/* Index: ENCARGADO_MASCOTA_FK                                  */
/*==============================================================*/
create  index ENCARGADO_MASCOTA_FK on MASCOTA (
CEDULA_ENCARGADO
);

/*==============================================================*/
/* Index: ESPECIE_RAZA_MASCOTA_FK                               */
/*==============================================================*/
create  index ESPECIE_RAZA_MASCOTA_FK on MASCOTA (
ID_RAZA,
ID_ESPCIE
);

/*==============================================================*/
/* Table: MASCOTA_CONSULTA                                      */
/*==============================================================*/
create table MASCOTA_CONSULTA (
   ID_CONSULTA          VARCHAR(10)          not null,
   ID_MASCOTA           VARCHAR(5)           not null,
   constraint PK_MASCOTA_CONSULTA primary key (ID_CONSULTA, ID_MASCOTA)
);

/*==============================================================*/
/* Index: MASCOTA_CONSULTA_PK                                   */
/*==============================================================*/
create unique index MASCOTA_CONSULTA_PK on MASCOTA_CONSULTA (
ID_CONSULTA,
ID_MASCOTA
);

/*==============================================================*/
/* Index: MASCOTA_CONSULTA_CONSULTA_FK                          */
/*==============================================================*/
create  index MASCOTA_CONSULTA_CONSULTA_FK on MASCOTA_CONSULTA (
ID_CONSULTA
);

/*==============================================================*/
/* Index: MASCOTA_CONSULTA2_FK                                  */
/*==============================================================*/
create  index MASCOTA_CONSULTA2_FK on MASCOTA_CONSULTA (
ID_MASCOTA
);

/*==============================================================*/
/* Table: RAZA                                                  */
/*==============================================================*/
create table RAZA (
   ID_RAZA              VARCHAR(4)           not null,
   NOM_RAZA             VARCHAR(50)          not null,
   constraint PK_RAZA primary key (ID_RAZA)
);

/*==============================================================*/
/* Index: RAZA_PK                                               */
/*==============================================================*/
create unique index RAZA_PK on RAZA (
ID_RAZA
);

/*==============================================================*/
/* Table: SEDE                                                  */
/*==============================================================*/
create table SEDE (
   ID_SEDE              VARCHAR(5)           not null,
   NOMBRE_SEDE          VARCHAR(50)          not null,
   constraint PK_SEDE primary key (ID_SEDE)
);

/*==============================================================*/
/* Index: SEDE_PK                                               */
/*==============================================================*/
create unique index SEDE_PK on SEDE (
ID_SEDE
);

/*==============================================================*/
/* Table: TIPO_VACUNA                                           */
/*==============================================================*/
create table TIPO_VACUNA (
   ID_TIPO_VACUNA       VARCHAR(5)           not null,
   TIPO_VACUNA          VARCHAR(50)          not null,
   constraint PK_TIPO_VACUNA primary key (ID_TIPO_VACUNA)
);

/*==============================================================*/
/* Index: TIPO_VACUNA_PK                                        */
/*==============================================================*/
create unique index TIPO_VACUNA_PK on TIPO_VACUNA (
ID_TIPO_VACUNA
);

/*==============================================================*/
/* Table: VACUNA                                                */
/*==============================================================*/
create table VACUNA (
   ID_VACUNA            VARCHAR(5)           not null,
   ID_TIPO_VACUNA       VARCHAR(5)           not null,
   NOMBRE_VACUNA        VARCHAR(50)          not null,
   constraint PK_VACUNA primary key (ID_VACUNA)
);

/*==============================================================*/
/* Index: VACUNA_PK                                             */
/*==============================================================*/
create unique index VACUNA_PK on VACUNA (
ID_VACUNA
);

/*==============================================================*/
/* Index: TIPO_VACUNA_VACUNA_FK                                 */
/*==============================================================*/
create  index TIPO_VACUNA_VACUNA_FK on VACUNA (
ID_TIPO_VACUNA
);

/*==============================================================*/
/* Table: VETERINARIO                                           */
/*==============================================================*/
create table VETERINARIO (
   CEDULA_VETERINARIO   VARCHAR(10)          not null,
   NOMBRE_VETERINARIO   VARCHAR(50)          not null,
   constraint PK_VETERINARIO primary key (CEDULA_VETERINARIO)
);

/*==============================================================*/
/* Index: VETERINARIO_PK                                        */
/*==============================================================*/
create unique index VETERINARIO_PK on VETERINARIO (
CEDULA_VETERINARIO
);

alter table CONSULTA
   add constraint FK_CONSULTA_SEDE_CONS_SEDE foreign key (ID_SEDE)
      references SEDE (ID_SEDE)
      on delete restrict on update restrict;

alter table CONSULTA
   add constraint FK_CONSULTA_VACUNA_CO_VACUNA foreign key (ID_VACUNA)
      references VACUNA (ID_VACUNA)
      on delete restrict on update restrict;

alter table CONSULTA
   add constraint FK_CONSULTA_VETERINAR_VETERINA foreign key (CEDULA_VETERINARIO)
      references VETERINARIO (CEDULA_VETERINARIO)
      on delete restrict on update restrict;

alter table ESPECIE_RAZA
   add constraint FK_ESPECIE__ESPECIE_R_ESPECIE foreign key (ID_ESPCIE)
      references ESPECIE (ID_ESPCIE)
      on delete restrict on update restrict;

alter table ESPECIE_RAZA
   add constraint FK_ESPECIE__ESPECIE_R_RAZA foreign key (ID_RAZA)
      references RAZA (ID_RAZA)
      on delete restrict on update restrict;

alter table MASCOTA
   add constraint FK_MASCOTA_ENCARGADO_ENCARGAD foreign key (CEDULA_ENCARGADO)
      references ENCARGADO (CEDULA_ENCARGADO)
      on delete restrict on update restrict;

alter table MASCOTA
   add constraint FK_MASCOTA_ESPECIE_R_ESPECIE_ foreign key (ID_RAZA, ID_ESPCIE)
      references ESPECIE_RAZA (ID_RAZA, ID_ESPCIE)
      on delete restrict on update restrict;

alter table MASCOTA_CONSULTA
   add constraint FK_MASCOTA__MASCOTA_C_MASCOTA foreign key (ID_MASCOTA)
      references MASCOTA (ID_MASCOTA)
      on delete restrict on update restrict;

alter table MASCOTA_CONSULTA
   add constraint FK_MASCOTA__MASCOTA_C_CONSULTA foreign key (ID_CONSULTA)
      references CONSULTA (ID_CONSULTA)
      on delete restrict on update restrict;

alter table VACUNA
   add constraint FK_VACUNA_TIPO_VACU_TIPO_VAC foreign key (ID_TIPO_VACUNA)
      references TIPO_VACUNA (ID_TIPO_VACUNA)
      on delete restrict on update restrict;

