--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.8
-- Dumped by pg_dump version 9.4.8
-- Started on 2016-08-23 19:34:47 WAT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1 (class 3079 OID 11893)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2228 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 175 (class 1259 OID 25924)
-- Name: article; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE article (
    id bigint NOT NULL,
    nom character varying(5000),
    stock bigint
);


ALTER TABLE article OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 25932)
-- Name: camion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE camion (
    id bigint NOT NULL,
    capacite character varying(255),
    caracteristique character varying(255),
    immatriculation character varying(255) NOT NULL,
    marque character varying(255),
    numero_carte_grise character varying(255),
    proprietaire character varying(255)
);


ALTER TABLE camion OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 26063)
-- Name: client_transport; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE client_transport (
    id bigint NOT NULL,
    adresse character varying(255),
    nom character varying(255),
    telephone bigint
);


ALTER TABLE client_transport OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 26071)
-- Name: client_vente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE client_vente (
    id bigint NOT NULL,
    adresse character varying(255),
    nom character varying(255),
    telephone bigint
);


ALTER TABLE client_vente OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 26146)
-- Name: commande_transport; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE commande_transport (
    id bigint NOT NULL,
    montant bigint,
    prix bigint,
    quantite bigint,
    facture_id bigint,
    produit_id bigint,
    date_commande timestamp without time zone,
    destination character varying(255),
    reference_bon_livraison character varying(255),
    camion_id bigint
);


ALTER TABLE commande_transport OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 26114)
-- Name: commande_vente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE commande_vente (
    id bigint NOT NULL,
    montant bigint,
    prix bigint,
    quantite bigint,
    facture_id bigint,
    produit_id bigint
);


ALTER TABLE commande_vente OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 25948)
-- Name: depense; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE depense (
    id bigint NOT NULL,
    libelle character varying(5000),
    montant bigint,
    when_done timestamp without time zone,
    camion_id bigint
);


ALTER TABLE depense OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 25956)
-- Name: entree_article; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE entree_article (
    id bigint NOT NULL,
    provenance character varying(255),
    quantite bigint,
    when_done timestamp without time zone,
    who_done character varying(255),
    article_id bigint
);


ALTER TABLE entree_article OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 26119)
-- Name: facture_transport; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE facture_transport (
    id bigint NOT NULL,
    montant bigint,
    montant_lettre character varying(5000),
    reference_facture_definitive character varying(255),
    reference_facture_proforma character varying(255) NOT NULL,
    when_done timestamp without time zone,
    who_done character varying(255),
    client_id bigint,
    paiement bigint,
    retenue_bic double precision,
    net double precision,
    retenue_sonidep double precision,
    net_sonidep double precision,
    objet character varying(255),
    reference_impression_definitive character varying(255),
    reference_impression_proforma character varying(255)
);


ALTER TABLE facture_transport OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 26097)
-- Name: facture_vente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE facture_vente (
    id bigint NOT NULL,
    montant bigint,
    montant_lettre character varying(5000),
    reference_facture_definitive character varying(255),
    reference_facture_proforma character varying(255) NOT NULL,
    when_done timestamp without time zone,
    who_done character varying(255),
    client_id bigint,
    paiement bigint,
    reference_impression_definitive character varying(255),
    reference_impression_proforma character varying(255)
);


ALTER TABLE facture_vente OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 25910)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE hibernate_sequence OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 26169)
-- Name: paiement_transport; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE paiement_transport (
    id bigint NOT NULL,
    echeance timestamp without time zone,
    montant bigint NOT NULL,
    type character varying(255) NOT NULL,
    when_done timestamp without time zone,
    who_done character varying(255),
    facture_id bigint,
    status character varying(255)
);


ALTER TABLE paiement_transport OWNER TO postgres;

--
-- TOC entry 192 (class 1259 OID 26182)
-- Name: paiement_vente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE paiement_vente (
    id bigint NOT NULL,
    echeance timestamp without time zone,
    montant bigint NOT NULL,
    status character varying(255),
    type character varying(255) NOT NULL,
    when_done timestamp without time zone,
    who_done character varying(255),
    facture_id bigint
);


ALTER TABLE paiement_vente OWNER TO postgres;

--
-- TOC entry 179 (class 1259 OID 25964)
-- Name: personnel; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE personnel (
    id bigint NOT NULL,
    fonction character varying(255),
    nom character varying(255) NOT NULL,
    prenom character varying(255) NOT NULL,
    telephone bigint,
    salaire bigint
);


ALTER TABLE personnel OWNER TO postgres;

--
-- TOC entry 184 (class 1259 OID 26056)
-- Name: produit; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE produit (
    id bigint NOT NULL,
    nom character varying(255) NOT NULL,
    prix_achat bigint,
    prix_transport bigint,
    prix_vente bigint
);


ALTER TABLE produit OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 26195)
-- Name: rapport; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rapport (
    id bigint NOT NULL,
    code_rapport character varying(2) NOT NULL,
    libelle_rapport character varying(256) NOT NULL,
    template character varying(256) NOT NULL,
    tmp_query text
);


ALTER TABLE rapport OWNER TO postgres;

--
-- TOC entry 180 (class 1259 OID 25972)
-- Name: reparation; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE reparation (
    id bigint NOT NULL,
    affectation character varying(255),
    commentaire_controleur character varying(5000),
    date_emission timestamp without time zone,
    date_paiement timestamp without time zone,
    kilometrage_debut character varying(255),
    kilometrage_fin character varying(255),
    montant bigint,
    montant_lettre character varying(255),
    motif character varying(5000),
    nom_reparateur character varying(255),
    numero character varying(255) NOT NULL,
    prenom_reparateur character varying(255),
    reparateur character varying(255),
    service character varying(255),
    status character varying(255),
    when_done timestamp without time zone,
    who_done character varying(255),
    camion_id bigint,
    personnel_id bigint,
    reference_impression_bon_reparation character varying(255),
    reference_impression_demande_travaux character varying(255),
    reference_impression_ordre_paiement character varying(255)
);


ALTER TABLE reparation OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 26045)
-- Name: salaire; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE salaire (
    id bigint NOT NULL,
    avance bigint,
    personnel_id bigint,
    when_done timestamp without time zone
);


ALTER TABLE salaire OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 25980)
-- Name: sortie_article; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE sortie_article (
    id bigint NOT NULL,
    quantite bigint,
    when_done timestamp without time zone,
    who_done character varying(255),
    article_id bigint,
    camion_id bigint,
    type character varying(255)
);


ALTER TABLE sortie_article OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 26019)
-- Name: taf; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE taf (
    id bigint NOT NULL,
    montant bigint,
    observation character varying(5000),
    travail character varying(5000),
    reparation_id bigint
);


ALTER TABLE taf OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 25900)
-- Name: utilisateur; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE utilisateur (
    id bigint NOT NULL,
    email character varying(255),
    nom character varying(255),
    password character varying(255) NOT NULL,
    telephone bigint NOT NULL
);


ALTER TABLE utilisateur OWNER TO postgres;

--
-- TOC entry 2202 (class 0 OID 25924)
-- Dependencies: 175
-- Data for Name: article; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO article (id, nom, stock) VALUES (8, 'Pneu', 90);
INSERT INTO article (id, nom, stock) VALUES (49, 'filtre gazoil Mercedes', 550);
INSERT INTO article (id, nom, stock) VALUES (77, 'ordinateur portable', 1200);


--
-- TOC entry 2203 (class 0 OID 25932)
-- Dependencies: 176
-- Data for Name: camion; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO camion (id, capacite, caracteristique, immatriculation, marque, numero_carte_grise, proprietaire) VALUES (4, NULL, 'Rouge', '8B 2582', NULL, 'OF l', 'Mani');
INSERT INTO camion (id, capacite, caracteristique, immatriculation, marque, numero_carte_grise, proprietaire) VALUES (86, NULL, 'couleur rouge', '7E 4580', NULL, 'carte 450000', 'Ismael kader');


--
-- TOC entry 2212 (class 0 OID 26063)
-- Dependencies: 185
-- Data for Name: client_transport; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO client_transport (id, adresse, nom, telephone) VALUES (32, 'Recasement, Niamey', 'Sonidep', 92332322);
INSERT INTO client_transport (id, adresse, nom, telephone) VALUES (94, 'Niamey Niger', 'Total', 20125820);


--
-- TOC entry 2213 (class 0 OID 26071)
-- Dependencies: 186
-- Data for Name: client_vente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO client_vente (id, adresse, nom, telephone) VALUES (33, 'Recasement, Niamey', 'b', 92332322);


--
-- TOC entry 2217 (class 0 OID 26146)
-- Dependencies: 190
-- Data for Name: commande_transport; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO commande_transport (id, montant, prix, quantite, facture_id, produit_id, date_commande, destination, reference_bon_livraison, camion_id) VALUES (97, 1100000, 550, 2000, 95, 31, '2016-08-25 00:00:00', 'Mali', 'BL200', 4);
INSERT INTO commande_transport (id, montant, prix, quantite, facture_id, produit_id, date_commande, destination, reference_bon_livraison, camion_id) VALUES (100, 33000000, 550, 60000, 99, 31, '2016-08-19 00:00:00', 'BENIN', 'BL300', 4);
INSERT INTO commande_transport (id, montant, prix, quantite, facture_id, produit_id, date_commande, destination, reference_bon_livraison, camion_id) VALUES (111, 8250000, 550, 15000, 110, 31, '2016-08-24 00:00:00', 'Magaria', 'BL4000', 4);
INSERT INTO commande_transport (id, montant, prix, quantite, facture_id, produit_id, date_commande, destination, reference_bon_livraison, camion_id) VALUES (113, 4800000, 320, 15000, 112, 82, '2016-08-24 00:00:00', 'Maroc', 'BL5000', 4);


--
-- TOC entry 2215 (class 0 OID 26114)
-- Dependencies: 188
-- Data for Name: commande_vente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO commande_vente (id, montant, prix, quantite, facture_id, produit_id) VALUES (74, 12500000, 500, 25000, 73, 31);
INSERT INTO commande_vente (id, montant, prix, quantite, facture_id, produit_id) VALUES (75, 6000000, 500, 12000, 73, 31);
INSERT INTO commande_vente (id, montant, prix, quantite, facture_id, produit_id) VALUES (109, 7500000, 500, 15000, 108, 31);


--
-- TOC entry 2204 (class 0 OID 25948)
-- Dependencies: 177
-- Data for Name: depense; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO depense (id, libelle, montant, when_done, camion_id) VALUES (19, 'Changement de pneux', 3000, '2016-08-16 14:57:49.761', 4);
INSERT INTO depense (id, libelle, montant, when_done, camion_id) VALUES (48, 'Achat de vitres', 20000, '2016-08-17 20:07:40.556', 4);
INSERT INTO depense (id, libelle, montant, when_done, camion_id) VALUES (87, 'changement vices', 30000, '2016-08-23 10:37:22.705', 86);
INSERT INTO depense (id, libelle, montant, when_done, camion_id) VALUES (88, 'peinture', 45000, '2016-08-23 10:37:41.557', 86);


--
-- TOC entry 2205 (class 0 OID 25956)
-- Dependencies: 178
-- Data for Name: entree_article; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO entree_article (id, provenance, quantite, when_done, who_done, article_id) VALUES (16, 'Niamey', 100, '2016-08-16 12:37:43.115', NULL, 8);
INSERT INTO entree_article (id, provenance, quantite, when_done, who_done, article_id) VALUES (50, 'Niamey', 500, '2016-08-17 20:11:25.879', NULL, 49);
INSERT INTO entree_article (id, provenance, quantite, when_done, who_done, article_id) VALUES (51, 'Maradi', 100, '2016-08-17 20:11:52.248', NULL, 49);
INSERT INTO entree_article (id, provenance, quantite, when_done, who_done, article_id) VALUES (78, 'Maradi', 1000, '2016-08-23 10:22:43.247', NULL, 77);
INSERT INTO entree_article (id, provenance, quantite, when_done, who_done, article_id) VALUES (79, 'DOsso', 500, '2016-08-23 10:22:50.577', NULL, 77);


--
-- TOC entry 2216 (class 0 OID 26119)
-- Dependencies: 189
-- Data for Name: facture_transport; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO facture_transport (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, retenue_bic, net, retenue_sonidep, net_sonidep, objet, reference_impression_definitive, reference_impression_proforma) VALUES (95, 1100000, 'un million cent vingt deux mille  ', NULL, 'bVuWikqU3K', '2016-08-23 11:13:54.583', NULL, 94, 1000000, 22000, 1122000, NULL, NULL, 'TRANSPORT HYDROCARBURE', '6474MKMnrf', 'ObMNiMiZl5');
INSERT INTO facture_transport (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, retenue_bic, net, retenue_sonidep, net_sonidep, objet, reference_impression_definitive, reference_impression_proforma) VALUES (99, 33000000, 'trente cinq million six cent soixante dix neuf mille six cent   ', NULL, 'aCBq2fo6Z5', '2016-08-23 11:26:06.678', NULL, 32, 5679600, 660000, 33660000, 2019600, 35679600, 'TRANSPORT GAZ', NULL, NULL);
INSERT INTO facture_transport (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, retenue_bic, net, retenue_sonidep, net_sonidep, objet, reference_impression_definitive, reference_impression_proforma) VALUES (110, 8250000, 'huit million neuf cent dix neuf mille neuf cent   ', 'jdl2ROdt93', 'jdl2ROdt93', '2016-08-23 16:16:16.35', NULL, 32, 0, 165000, 8415000, 504900, 8919900, 'TEST SONIDEP', 'jdl2ROdt93', 'jdl2ROdt93');
INSERT INTO facture_transport (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, retenue_bic, net, retenue_sonidep, net_sonidep, objet, reference_impression_definitive, reference_impression_proforma) VALUES (112, 4800000, 'quatre million huit cent quatre vingt seize mille  ', 'anWFacUr5t', 'anWFacUr5t', '2016-08-23 16:19:47.331', NULL, 94, 0, 96000, 4896000, NULL, NULL, 'TEST TOTAL', 'anWFacUr5t', 'anWFacUr5t');


--
-- TOC entry 2214 (class 0 OID 26097)
-- Dependencies: 187
-- Data for Name: facture_vente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO facture_vente (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, reference_impression_definitive, reference_impression_proforma) VALUES (73, 0, 'dix huit million cinq cent  mille  ', '', 'ohbNzmgkUJ', '2016-08-23 00:29:17.13', NULL, 33, 0, '1', '1');
INSERT INTO facture_vente (id, montant, montant_lettre, reference_facture_definitive, reference_facture_proforma, when_done, who_done, client_id, paiement, reference_impression_definitive, reference_impression_proforma) VALUES (108, 0, 'sept million cinq cent  mille  ', NULL, 'ppUiAW8c4d', '2016-08-23 16:11:51.125', NULL, 33, 0, 'ppUiAW8c4d', 'ppUiAW8c4d');


--
-- TOC entry 2229 (class 0 OID 0)
-- Dependencies: 174
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('hibernate_sequence', 113, true);


--
-- TOC entry 2218 (class 0 OID 26169)
-- Dependencies: 191
-- Data for Name: paiement_transport; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO paiement_transport (id, echeance, montant, type, when_done, who_done, facture_id, status) VALUES (98, '2016-08-31 00:00:00', 1000000, 'Avance', '2016-08-23 10:58:51.666', NULL, 95, 'Fermé');
INSERT INTO paiement_transport (id, echeance, montant, type, when_done, who_done, facture_id, status) VALUES (103, '2016-08-31 00:00:00', 5679600, 'Partiel', '2016-08-23 12:07:59.811', NULL, 99, 'Ouvert');


--
-- TOC entry 2219 (class 0 OID 26182)
-- Dependencies: 192
-- Data for Name: paiement_vente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO paiement_vente (id, echeance, montant, status, type, when_done, who_done, facture_id) VALUES (101, '2016-08-26 00:00:00', 500000, 'Fermé', 'Avance', '2016-08-23 11:43:56.472', NULL, 73);


--
-- TOC entry 2206 (class 0 OID 25964)
-- Dependencies: 179
-- Data for Name: personnel; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO personnel (id, fonction, nom, prenom, telephone, salaire) VALUES (5, 'Chauffeur', 'Aziz', 'Karim', 95050, 450000);
INSERT INTO personnel (id, fonction, nom, prenom, telephone, salaire) VALUES (83, 'Administratif', 'Halim', 'Nass', 92929292, 320000);


--
-- TOC entry 2211 (class 0 OID 26056)
-- Dependencies: 184
-- Data for Name: produit; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO produit (id, nom, prix_achat, prix_transport, prix_vente) VALUES (31, 'Essence', 450, 550, 500);
INSERT INTO produit (id, nom, prix_achat, prix_transport, prix_vente) VALUES (82, 'Gaz', 300, 320, 310);


--
-- TOC entry 2220 (class 0 OID 26195)
-- Dependencies: 193
-- Data for Name: rapport; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (1, 'FP', 'Facture proforma', 'FactureProforma1.prpt
', 'SELECT
     *
FROM 
      public.commande_transport
     ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (7, 'TP', 'Facture transport proforma', 'Facture-Transport-Proforma.prpt', 'SELECT
     *
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

  
   
     
      WHERE public.facture_transport.reference_impression_proforma = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (2, 'BR', 'Bon de reparation', 'Bon-Reparation.prpt', 'SELECT
     *
FROM 
      public.reparation

       INNER JOIN public.camion
      ON public.reparation.camion_id = public.camion.id

      INNER JOIN personnel
      ON public.reparation.personnel_id = public.personnel.id

      WHERE public.reparation.reference_impression_bon_reparation = ''${reference}''    
        ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (8, 'TD', 'Facture transport definitive', 'Facture-Transport-Definitive.prpt', 'SELECT
     *
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

  
   
     
      WHERE public.facture_transport.reference_impression_definitive = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (10, 'SP', 'Facture transport proforma sonidep', 'Facture-Transport-Proforma-Sonidep.prpt', 'SELECT
     *
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id
     
      WHERE public.facture_transport.reference_impression_proforma = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (9, 'SD', 'Facture transport Definitive sonidep', 'Facture-Transport-Definitive-Sonidep.prpt', 'SELECT
     *
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id
     
      WHERE public.facture_transport.reference_impression_definitive = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (4, 'OP', 'Ordre de Paiement', 'Ordre-Paiement.prpt', 'SELECT
     taf.travail, taf.montant as prix_travail, reparation.date_emission, reparation.date_paiement, reparation.montant as net, reparation.service, reparation.montant_lettre, reparation.motif, reparation.numero
FROM 
      public.taf

 INNER JOIN public.reparation
      ON public.taf.reparation_id = public.reparation.id

     
 INNER JOIN public.camion
      ON public.reparation.camion_id = public.camion.id

       INNER JOIN public.personnel
      ON public.reparation.personnel_id = public.personnel.id

      WHERE public.reparation.reference_impression_ordre_paiement = ''${reference}''

      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (5, 'VP', 'Facture vente proforma', 'Facture-Vente-Proforma.prpt', 'SELECT
     produit.nom as designation,
     commande_vente.prix, commande_vente.quantite, commande_vente.montant as montanta_unitaire, facture_vente.montant as montant, client_vente.nom as societe, facture_vente.when_done as jour
FROM 
      public.commande_vente
      
      INNER JOIN public.facture_vente 
      ON public.commande_vente.facture_id = public.facture_vente.id
      
      INNER JOIN public.produit
      ON public.commande_vente.produit_id = public.produit.id

       INNER JOIN public.client_vente
      ON public.facture_vente.client_id = public.client_vente.id
     
      WHERE public.facture_vente.reference_impression_proforma = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (6, 'VD', 'Facture vente Definitive', 'Facture-Vente-Definitive.prpt', 'SELECT
     produit.nom as designation,
     commande_vente.prix, commande_vente.quantite, commande_vente.montant as montanta_unitaire, facture_vente.montant as montant, client_vente.nom as societe, facture_vente.when_done as jour
FROM 
      public.commande_vente
      
      INNER JOIN public.facture_vente 
      ON public.commande_vente.facture_id = public.facture_vente.id
      
      INNER JOIN public.produit
      ON public.commande_vente.produit_id = public.produit.id

       INNER JOIN public.client_vente
      ON public.facture_vente.client_id = public.client_vente.id
     
      WHERE public.facture_vente.reference_impression_definitive = ''${reference}''
      ');
INSERT INTO rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (3, 'DT', 'Demande de Travaux', 'Demande-Travaux.prpt', 'SELECT
     taf.travail, taf.observation, reparation.service, reparation.affectation, reparation.kilometrage_debut, reparation.kilometrage_fin, reparation.nom_reparateur,
     reparation.prenom_reparateur, reparation.commentaire_controleur, camion.immatriculation, personnel.nom as nom_chauffeur, personnel.prenom as prenom_chauffeur
FROM 
      public.taf

 INNER JOIN public.reparation
      ON public.taf.reparation_id = public.reparation.id

     
 INNER JOIN public.camion
      ON public.reparation.camion_id = public.camion.id

       INNER JOIN public.personnel
      ON public.reparation.personnel_id = public.personnel.id     
        WHERE public.reparation.reference_impression_demande_travaux = ''${reference}'' 
      ');


--
-- TOC entry 2207 (class 0 OID 25972)
-- Dependencies: 180
-- Data for Name: reparation; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (45, 'GPL', 'changement fait', '2016-08-19 00:00:00', '2016-08-20 00:00:00', '460000', '460000', 46000, 'quarante six mille  ', 'une tres longue présentation ici est présente lors des journées internationales des cométietions internationsles', 'Ahlmed', 'SOA0002', 'Kader', 'Issa Ali', 'Garage 1 ', NULL, '2016-08-17 20:00:28.584', NULL, 4, 5, 'WAsWaIbKyh', '8Q8n5Gs9px', 'buOKuf27Gs');
INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (90, 'GE', 'Un long commentaire ici', '2016-01-01 00:00:00', '2016-08-25 00:00:00', '460000', '470000', 17000, 'dix sept mille  ', 'Un grand pas pour l''homme, un petit pas pour l''humanité', 'Touré', 'SOA0005', 'Koiré', 'Bagué SSI', 'ATT Service', NULL, '2016-08-23 10:41:58.827', NULL, 86, 83, NULL, NULL, NULL);
INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (6, 'GE', 'Propore', '2016-08-20 00:00:00', '2016-08-18 00:00:00', '30000', '54000', 9835, 'neuf mille huit cent trente cinq  ', 'une tres longue présentation ici est présente lors des journées internationales des cométietions internationsles', 'Bachir', 'SOA0001', 'Aminia', 'Moussa service import ', 'ATN', NULL, '2016-08-16 10:46:19.482', NULL, 4, 5, 'aCziNXcJIs', '1', '1');
INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (105, 'GE', 'commentaires...', '2016-08-25 00:00:00', '2016-08-27 00:00:00', '250', '250', 35000, 'trente cinq mille  ', 'Eminem', 'Illa', 'SOA0008', 'Abdou', 'Eminem', 'EPC', NULL, '2016-08-23 15:15:17.796', NULL, 86, 83, '9gqtdo39jP', '9gqtdo39jP', '9gqtdo39jP');
INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (104, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'jojo buu', NULL, 'SOA0007', NULL, 'kiki', NULL, NULL, '2016-08-23 14:33:24.72', NULL, 86, 83, '1Sk4tjewi1', NULL, NULL);
INSERT INTO reparation (id, affectation, commentaire_controleur, date_emission, date_paiement, kilometrage_debut, kilometrage_fin, montant, montant_lettre, motif, nom_reparateur, numero, prenom_reparateur, reparateur, service, status, when_done, who_done, camion_id, personnel_id, reference_impression_bon_reparation, reference_impression_demande_travaux, reference_impression_ordre_paiement) VALUES (70, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'Course de voiture', NULL, 'SOA0003', '', 'HAMID', NULL, NULL, '2015-08-22 16:56:20.098', NULL, 4, 5, 'q1PLfI6ahQ', 'Lm1RR8o7Gx', NULL);


--
-- TOC entry 2210 (class 0 OID 26045)
-- Dependencies: 183
-- Data for Name: salaire; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO salaire (id, avance, personnel_id, when_done) VALUES (84, 120000, 83, '2016-08-25 00:00:00');
INSERT INTO salaire (id, avance, personnel_id, when_done) VALUES (26, 3000, 5, '2016-08-23 10:34:37.336');


--
-- TOC entry 2208 (class 0 OID 25980)
-- Dependencies: 181
-- Data for Name: sortie_article; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO sortie_article (id, quantite, when_done, who_done, article_id, camion_id, type) VALUES (18, 10, '2016-08-16 12:39:54.645', NULL, 8, 4, 'Perdu');
INSERT INTO sortie_article (id, quantite, when_done, who_done, article_id, camion_id, type) VALUES (52, 50, '2016-08-17 20:12:17.052', NULL, 49, 4, 'Normale');
INSERT INTO sortie_article (id, quantite, when_done, who_done, article_id, camion_id, type) VALUES (80, 300, '2016-08-23 10:23:01.478', NULL, 77, 4, 'Normale');


--
-- TOC entry 2209 (class 0 OID 26019)
-- Dependencies: 182
-- Data for Name: taf; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (22, 2200, 'n', 'a0', 6);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (27, 1600, 'cool', 'Changement de vitre', 6);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (28, 10, 'Ok', 'Feux optiques', 6);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (30, 25, 'b', 'b', 6);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (29, 6000, 'a', 'a', 6);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (46, 36000, 'parfais', 'verifcation des ecrous', 45);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (47, 10000, 'changée', 'chambre à air', 45);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (92, 5000, 'La batterie est de mauvaise qualité', 'Battérie', 90);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (93, 12000, 'La chambre à air est glonflée', 'Chambre à air', 90);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (106, 30000, 'ok', 'Cuire', 105);
INSERT INTO taf (id, montant, observation, travail, reparation_id) VALUES (107, 5000, 'ok', 'Chaussure', 105);


--
-- TOC entry 2200 (class 0 OID 25900)
-- Dependencies: 173
-- Data for Name: utilisateur; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO utilisateur (id, email, nom, password, telephone) VALUES (1, 'bachir@bachir.com', 'Bachir', '123', 92332322);


--
-- TOC entry 2015 (class 2606 OID 25931)
-- Name: article_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY article
    ADD CONSTRAINT article_pkey PRIMARY KEY (id);


--
-- TOC entry 2017 (class 2606 OID 25939)
-- Name: camion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY camion
    ADD CONSTRAINT camion_pkey PRIMARY KEY (id);


--
-- TOC entry 2041 (class 2606 OID 26070)
-- Name: client_transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY client_transport
    ADD CONSTRAINT client_transport_pkey PRIMARY KEY (id);


--
-- TOC entry 2043 (class 2606 OID 26078)
-- Name: client_vente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY client_vente
    ADD CONSTRAINT client_vente_pkey PRIMARY KEY (id);


--
-- TOC entry 2059 (class 2606 OID 26150)
-- Name: commande_transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY commande_transport
    ADD CONSTRAINT commande_transport_pkey PRIMARY KEY (id);


--
-- TOC entry 2051 (class 2606 OID 26118)
-- Name: commande_vente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY commande_vente
    ADD CONSTRAINT commande_vente_pkey PRIMARY KEY (id);


--
-- TOC entry 2021 (class 2606 OID 25955)
-- Name: depense_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY depense
    ADD CONSTRAINT depense_pkey PRIMARY KEY (id);


--
-- TOC entry 2023 (class 2606 OID 25963)
-- Name: entree_materiel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY entree_article
    ADD CONSTRAINT entree_materiel_pkey PRIMARY KEY (id);


--
-- TOC entry 2053 (class 2606 OID 26126)
-- Name: facture_transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_transport
    ADD CONSTRAINT facture_transport_pkey PRIMARY KEY (id);


--
-- TOC entry 2045 (class 2606 OID 26104)
-- Name: facture_vente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_vente
    ADD CONSTRAINT facture_vente_pkey PRIMARY KEY (id);


--
-- TOC entry 2061 (class 2606 OID 26176)
-- Name: paiement_transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY paiement_transport
    ADD CONSTRAINT paiement_transport_pkey PRIMARY KEY (id);


--
-- TOC entry 2063 (class 2606 OID 26189)
-- Name: paiement_vente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY paiement_vente
    ADD CONSTRAINT paiement_vente_pkey PRIMARY KEY (id);


--
-- TOC entry 2025 (class 2606 OID 25971)
-- Name: personnel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY personnel
    ADD CONSTRAINT personnel_pkey PRIMARY KEY (id);


--
-- TOC entry 2037 (class 2606 OID 26060)
-- Name: produit_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produit
    ADD CONSTRAINT produit_pkey PRIMARY KEY (id);


--
-- TOC entry 2065 (class 2606 OID 26202)
-- Name: rapport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rapport
    ADD CONSTRAINT rapport_pkey PRIMARY KEY (id);


--
-- TOC entry 2027 (class 2606 OID 25979)
-- Name: reparation_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY reparation
    ADD CONSTRAINT reparation_pkey PRIMARY KEY (id);


--
-- TOC entry 2035 (class 2606 OID 26049)
-- Name: salaire_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY salaire
    ADD CONSTRAINT salaire_pkey PRIMARY KEY (id);


--
-- TOC entry 2031 (class 2606 OID 25984)
-- Name: sortie_article_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY sortie_article
    ADD CONSTRAINT sortie_article_pkey PRIMARY KEY (id);


--
-- TOC entry 2033 (class 2606 OID 26026)
-- Name: tav_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY taf
    ADD CONSTRAINT tav_pkey PRIMARY KEY (id);


--
-- TOC entry 2047 (class 2606 OID 26106)
-- Name: uk_1tt674ouwqidurgvuvr65piyd; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_vente
    ADD CONSTRAINT uk_1tt674ouwqidurgvuvr65piyd UNIQUE (reference_facture_definitive);


--
-- TOC entry 2055 (class 2606 OID 26130)
-- Name: uk_70r0t4ssxiewhhkmgw9r6c1sx; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_transport
    ADD CONSTRAINT uk_70r0t4ssxiewhhkmgw9r6c1sx UNIQUE (reference_facture_proforma);


--
-- TOC entry 2067 (class 2606 OID 26208)
-- Name: uk_80ebmap6kpetnnh7u6k8wi3iw; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rapport
    ADD CONSTRAINT uk_80ebmap6kpetnnh7u6k8wi3iw UNIQUE (template);


--
-- TOC entry 2019 (class 2606 OID 25986)
-- Name: uk_cbml599i7r4ppm9itbq9rdfeg; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY camion
    ADD CONSTRAINT uk_cbml599i7r4ppm9itbq9rdfeg UNIQUE (immatriculation);


--
-- TOC entry 2029 (class 2606 OID 25988)
-- Name: uk_l9er4e9l2hapha3rayftbadj4; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY reparation
    ADD CONSTRAINT uk_l9er4e9l2hapha3rayftbadj4 UNIQUE (numero);


--
-- TOC entry 2069 (class 2606 OID 26206)
-- Name: uk_lerfgbs0ufa8lhct1to8i5mbg; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rapport
    ADD CONSTRAINT uk_lerfgbs0ufa8lhct1to8i5mbg UNIQUE (libelle_rapport);


--
-- TOC entry 2011 (class 2606 OID 25909)
-- Name: uk_m743qx26ouhlxlykspth3gs3k; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY utilisateur
    ADD CONSTRAINT uk_m743qx26ouhlxlykspth3gs3k UNIQUE (telephone);


--
-- TOC entry 2049 (class 2606 OID 26108)
-- Name: uk_n03yki7sof9ujscvtv5k1mdl6; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_vente
    ADD CONSTRAINT uk_n03yki7sof9ujscvtv5k1mdl6 UNIQUE (reference_facture_proforma);


--
-- TOC entry 2039 (class 2606 OID 26062)
-- Name: uk_p3flguk26lkj16433geia6xx8; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produit
    ADD CONSTRAINT uk_p3flguk26lkj16433geia6xx8 UNIQUE (nom);


--
-- TOC entry 2057 (class 2606 OID 26128)
-- Name: uk_pw27vbspu8bopcx8r87ge4csi; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY facture_transport
    ADD CONSTRAINT uk_pw27vbspu8bopcx8r87ge4csi UNIQUE (reference_facture_definitive);


--
-- TOC entry 2071 (class 2606 OID 26204)
-- Name: uk_s7500u2aodorut0fkewv51dg5; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rapport
    ADD CONSTRAINT uk_s7500u2aodorut0fkewv51dg5 UNIQUE (code_rapport);


--
-- TOC entry 2013 (class 2606 OID 25907)
-- Name: utilisateur_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY utilisateur
    ADD CONSTRAINT utilisateur_pkey PRIMARY KEY (id);


--
-- TOC entry 2086 (class 2606 OID 26151)
-- Name: fk24bumo5qd6s6ud1s4mq23hyge; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY commande_transport
    ADD CONSTRAINT fk24bumo5qd6s6ud1s4mq23hyge FOREIGN KEY (facture_id) REFERENCES facture_transport(id);


--
-- TOC entry 2072 (class 2606 OID 25989)
-- Name: fk49jgh6ojm4iw89p2jhcfkp6o6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY depense
    ADD CONSTRAINT fk49jgh6ojm4iw89p2jhcfkp6o6 FOREIGN KEY (camion_id) REFERENCES camion(id);


--
-- TOC entry 2080 (class 2606 OID 26040)
-- Name: fk5d35mstnv5j5ct6jqm4689nt8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY taf
    ADD CONSTRAINT fk5d35mstnv5j5ct6jqm4689nt8 FOREIGN KEY (reparation_id) REFERENCES reparation(id);


--
-- TOC entry 2078 (class 2606 OID 26014)
-- Name: fk67hg9qb1e60u02alblu27p897; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY sortie_article
    ADD CONSTRAINT fk67hg9qb1e60u02alblu27p897 FOREIGN KEY (camion_id) REFERENCES camion(id);


--
-- TOC entry 2082 (class 2606 OID 26109)
-- Name: fkbmp62nb16x5fa0v2u1ckclleg; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY facture_vente
    ADD CONSTRAINT fkbmp62nb16x5fa0v2u1ckclleg FOREIGN KEY (client_id) REFERENCES client_vente(id);


--
-- TOC entry 2090 (class 2606 OID 26190)
-- Name: fke3vhm8k5xt9efd4dfovkjcvfd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY paiement_vente
    ADD CONSTRAINT fke3vhm8k5xt9efd4dfovkjcvfd FOREIGN KEY (facture_id) REFERENCES facture_vente(id);


--
-- TOC entry 2079 (class 2606 OID 26027)
-- Name: fkgn8h8mrj0wrbo489fqxt1i91u; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY taf
    ADD CONSTRAINT fkgn8h8mrj0wrbo489fqxt1i91u FOREIGN KEY (reparation_id) REFERENCES reparation(id);


--
-- TOC entry 2081 (class 2606 OID 26050)
-- Name: fki03003bksvy6d8g6vvupe4vai; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY salaire
    ADD CONSTRAINT fki03003bksvy6d8g6vvupe4vai FOREIGN KEY (personnel_id) REFERENCES personnel(id);


--
-- TOC entry 2088 (class 2606 OID 26164)
-- Name: fki1gq6893ywqm8s4mspa4bmb5b; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY commande_transport
    ADD CONSTRAINT fki1gq6893ywqm8s4mspa4bmb5b FOREIGN KEY (camion_id) REFERENCES camion(id);


--
-- TOC entry 2075 (class 2606 OID 25999)
-- Name: fkityjpfiuugqyqmbctvvojiqt3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reparation
    ADD CONSTRAINT fkityjpfiuugqyqmbctvvojiqt3 FOREIGN KEY (camion_id) REFERENCES camion(id);


--
-- TOC entry 2089 (class 2606 OID 26177)
-- Name: fkj04j56rq8nn6bmyeogfyng4a2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY paiement_transport
    ADD CONSTRAINT fkj04j56rq8nn6bmyeogfyng4a2 FOREIGN KEY (facture_id) REFERENCES facture_transport(id);


--
-- TOC entry 2085 (class 2606 OID 26141)
-- Name: fklvgglx0gmsfq1pr58rwn5inkm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY facture_transport
    ADD CONSTRAINT fklvgglx0gmsfq1pr58rwn5inkm FOREIGN KEY (client_id) REFERENCES client_transport(id);


--
-- TOC entry 2084 (class 2606 OID 26136)
-- Name: fkma0m39j5gwxi3lq88rwci3kbi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY commande_vente
    ADD CONSTRAINT fkma0m39j5gwxi3lq88rwci3kbi FOREIGN KEY (produit_id) REFERENCES produit(id);


--
-- TOC entry 2076 (class 2606 OID 26004)
-- Name: fkmk8inudel0sedr780udmk87hd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reparation
    ADD CONSTRAINT fkmk8inudel0sedr780udmk87hd FOREIGN KEY (personnel_id) REFERENCES personnel(id);


--
-- TOC entry 2087 (class 2606 OID 26156)
-- Name: fkpqg3jw7i4t5drtn2i0o4snci7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY commande_transport
    ADD CONSTRAINT fkpqg3jw7i4t5drtn2i0o4snci7 FOREIGN KEY (produit_id) REFERENCES produit(id);


--
-- TOC entry 2083 (class 2606 OID 26131)
-- Name: fkqnb5vatnxdmo4m68o7uloqi61; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY commande_vente
    ADD CONSTRAINT fkqnb5vatnxdmo4m68o7uloqi61 FOREIGN KEY (facture_id) REFERENCES facture_vente(id);


--
-- TOC entry 2077 (class 2606 OID 26009)
-- Name: fkr9uwamy4eain346kj2p9jch5v; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY sortie_article
    ADD CONSTRAINT fkr9uwamy4eain346kj2p9jch5v FOREIGN KEY (article_id) REFERENCES article(id);


--
-- TOC entry 2074 (class 2606 OID 26035)
-- Name: fkrch7o9k41313w2peej0nfyfpu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY entree_article
    ADD CONSTRAINT fkrch7o9k41313w2peej0nfyfpu FOREIGN KEY (article_id) REFERENCES article(id);


--
-- TOC entry 2073 (class 2606 OID 25994)
-- Name: fks1trj29ghlxhry0udvvijfhtd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY entree_article
    ADD CONSTRAINT fks1trj29ghlxhry0udvvijfhtd FOREIGN KEY (article_id) REFERENCES article(id);


--
-- TOC entry 2227 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2016-08-23 19:34:47 WAT

--
-- PostgreSQL database dump complete
--

