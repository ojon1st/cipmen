INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (1, 'FP', 'Facture proforma', 'FactureProforma1.prpt
', 'SELECT
     *
FROM 
      public.commande_transport
     ');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (2, 'BR', 'Bon de reparation', 'Bon-Reparation.prpt', 'SELECT
     *
FROM 
      public.reparation

       INNER JOIN public.camion
      ON public.reparation.camion_id = public.camion.id

      INNER JOIN personnel
      ON public.reparation.personnel_id = public.personnel.id

      WHERE public.reparation.reference_impression_bon_reparation = ''${reference}''    
        ');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (5, 'VP', 'Facture vente proforma', 'Facture-Vente-Proforma.prpt', 'SELECT
     produit.nom as designation,
     commande_vente.prix, commande_vente.quantite, commande_vente.montant as montanta_unitaire,facture_vente.reference_facture_proforma, facture_vente.reference_facture_definitive,  facture_vente.montant as montant, client_vente.nom as societe, facture_vente.when_done as jour
FROM 
      public.commande_vente
      
      INNER JOIN public.facture_vente 
      ON public.commande_vente.facture_id = public.facture_vente.id
      
      INNER JOIN public.produit
      ON public.commande_vente.produit_id = public.produit.id

       INNER JOIN public.client_vente
      ON public.facture_vente.client_id = public.client_vente.id
     
      WHERE public.facture_vente.reference_facture_proforma = ''${reference}''
      ');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (7, 'TP', 'Facture transport proforma', 'Facture-Transport-Proforma.prpt', 'SELECT
     public.commande_transport.date_commande, public.commande_transport.prix, public.commande_transport.quantite, public.commande_transport.montant, public.commande_transport.reference_bon_livraison,
     public.commande_transport.destination, public.camion.immatriculation as immatriculation, public.camion.proprietaire as proprietaire, public.produit.nom as nom_produit, public.facture_transport.reference_facture_proforma,
     public.facture_transport.reference_facture_definitive,public.facture_transport.when_done, public.facture_transport.objet, public.facture_transport.montant as total, public.facture_transport.retenue_bic, public.facture_transport.retenue_sonidep,
     public.facture_transport.net, public.facture_transport.net_sonidep, public.facture_transport.montant_lettre, public.client_transport.nom as nom_client
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

      INNER JOIN public.client_transport
      ON public.facture_transport.client_id = public.client_transport.id
     
      WHERE public.facture_transport.reference_facture_proforma = ''${reference}''');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (6, 'VD', 'Facture vente Definitive', 'Facture-Vente-Definitive.prpt', 'SELECT
     produit.nom as designation,
     commande_vente.prix, commande_vente.quantite, commande_vente.montant as montanta_unitaire, facture_vente.montant as montant, facture_vente.reference_facture_proforma, facture_vente.reference_facture_definitive, client_vente.nom as societe, facture_vente.when_done as jour
FROM 
      public.commande_vente
      
      INNER JOIN public.facture_vente 
      ON public.commande_vente.facture_id = public.facture_vente.id
      
      INNER JOIN public.produit
      ON public.commande_vente.produit_id = public.produit.id

       INNER JOIN public.client_vente
      ON public.facture_vente.client_id = public.client_vente.id
     
      WHERE public.facture_vente.reference_facture_definitive = ''${reference}''
      ');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (4, 'OP', 'Ordre de Paiement', 'Ordre-Paiement.prpt', 'SELECT
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
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (10, 'SP', 'Facture transport proforma sonidep', 'Facture-Transport-Proforma-Sonidep.prpt', 'SELECT
     public.commande_transport.date_commande, public.commande_transport.prix, public.commande_transport.quantite, public.commande_transport.montant, public.commande_transport.reference_bon_livraison,
     public.commande_transport.destination, public.camion.immatriculation as immatriculation, public.camion.proprietaire as proprietaire, public.produit.nom as nom_produit, public.facture_transport.reference_facture_proforma,
     public.facture_transport.reference_facture_definitive,public.facture_transport.when_done, public.facture_transport.objet, public.facture_transport.montant as total, public.facture_transport.retenue_bic, public.facture_transport.retenue_sonidep,
     public.facture_transport.net, public.facture_transport.net_sonidep, public.facture_transport.montant_lettre, public.client_transport.nom as nom_client
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

      INNER JOIN public.client_transport
      ON public.facture_transport.client_id = public.client_transport.id
     
      WHERE public.facture_transport.reference_facture_proforma = ''${reference}''');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (3, 'DT', 'Demande de Travaux', 'Demande-Travaux.prpt', 'SELECT
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
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (9, 'SD', 'Facture transport Definitive sonidep', 'Facture-Transport-Definitive-Sonidep.prpt', 'SELECT
     public.commande_transport.date_commande, public.commande_transport.prix, public.commande_transport.quantite, public.commande_transport.montant, public.commande_transport.reference_bon_livraison,
     public.commande_transport.destination, public.camion.immatriculation as immatriculation, public.camion.proprietaire as proprietaire, public.produit.nom as nom_produit, public.facture_transport.reference_facture_proforma,
     public.facture_transport.reference_facture_definitive,public.facture_transport.when_done, public.facture_transport.objet, public.facture_transport.montant as total, public.facture_transport.retenue_bic, public.facture_transport.retenue_sonidep,
     public.facture_transport.net, public.facture_transport.net_sonidep, public.facture_transport.montant_lettre, public.client_transport.nom as nom_client
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

      INNER JOIN public.client_transport
      ON public.facture_transport.client_id = public.client_transport.id
     
      WHERE public.facture_transport.reference_facture_definitive = ''${reference}''');
INSERT INTO public.rapport (id, code_rapport, libelle_rapport, template, tmp_query) VALUES (8, 'TD', 'Facture transport definitive', 'Facture-Transport-Definitive.prpt', 'SELECT
     public.commande_transport.date_commande, public.commande_transport.prix, public.commande_transport.quantite, public.commande_transport.montant, public.commande_transport.reference_bon_livraison,
     public.commande_transport.destination, public.camion.immatriculation as immatriculation, public.camion.proprietaire as proprietaire, public.produit.nom as nom_produit, public.facture_transport.reference_facture_proforma,
     public.facture_transport.reference_facture_definitive,public.facture_transport.when_done, public.facture_transport.objet, public.facture_transport.montant as total, public.facture_transport.retenue_bic, public.facture_transport.retenue_sonidep,
     public.facture_transport.net, public.facture_transport.net_sonidep, public.facture_transport.montant_lettre, public.client_transport.nom as nom_client
FROM 
      public.commande_transport
      
      INNER JOIN public.facture_transport 
      ON public.commande_transport.facture_id = public.facture_transport.id
      
      INNER JOIN public.produit
      ON public.commande_transport.produit_id = public.produit.id

      INNER JOIN public.camion
      ON public.commande_transport.camion_id = public.camion.id

      INNER JOIN public.client_transport
      ON public.facture_transport.client_id = public.client_transport.id
     
      WHERE public.facture_transport.reference_facture_definitive = ''${reference}''');
