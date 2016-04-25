
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/Desktop/cipmen/conf/routes
// @DATE:Mon Apr 25 02:51:24 WAT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_7: controllers.Application,
  // @LINE:16
  Newsletters_0: controllers.Newsletters,
  // @LINE:19
  Profils_5: controllers.Profils,
  // @LINE:22
  Blogs_10: controllers.Blogs,
  // @LINE:26
  Evenements_1: controllers.Evenements,
  // @LINE:30
  Startups_2: controllers.Startups,
  // @LINE:34
  Incubateurs_9: controllers.Incubateurs,
  // @LINE:37
  Mediatheques_3: controllers.Mediatheques,
  // @LINE:40
  Postules_8: controllers.Postules,
  // @LINE:44
  Contacts_4: controllers.Contacts,
  // @LINE:50
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_7: controllers.Application,
    // @LINE:16
    Newsletters_0: controllers.Newsletters,
    // @LINE:19
    Profils_5: controllers.Profils,
    // @LINE:22
    Blogs_10: controllers.Blogs,
    // @LINE:26
    Evenements_1: controllers.Evenements,
    // @LINE:30
    Startups_2: controllers.Startups,
    // @LINE:34
    Incubateurs_9: controllers.Incubateurs,
    // @LINE:37
    Mediatheques_3: controllers.Mediatheques,
    // @LINE:40
    Postules_8: controllers.Postules,
    // @LINE:44
    Contacts_4: controllers.Contacts,
    // @LINE:50
    Assets_6: controllers.Assets
  ) = this(errorHandler, Application_7, Newsletters_0, Profils_5, Blogs_10, Evenements_1, Startups_2, Incubateurs_9, Mediatheques_3, Postules_8, Contacts_4, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_7, Newsletters_0, Profils_5, Blogs_10, Evenements_1, Startups_2, Incubateurs_9, Mediatheques_3, Postules_8, Contacts_4, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscription""", """controllers.Application.inscription()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscription""", """controllers.Application.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """connexion""", """controllers.Application.connexion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """connexion""", """controllers.Application.authentification()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deconnexion""", """controllers.Application.deconnexion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsletter""", """controllers.Newsletters.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profil""", """controllers.Profils.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs""", """controllers.Blogs.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs/$lien<[^/]+>""", """controllers.Blogs.read(lien:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evenements""", """controllers.Evenements.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evenements/$lien<[^/]+>""", """controllers.Evenements.read(lien:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startup""", """controllers.Startups.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startup/$nom<[^/]+>""", """controllers.Startups.read(nom:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """incubateur""", """controllers.Incubateurs.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mediatheques""", """controllers.Mediatheques.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postule""", """controllers.Postules.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postule""", """controllers.Postules.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts""", """controllers.Contacts.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts""", """controllers.Contacts.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_inscription1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inscription")))
  )
  private[this] lazy val controllers_Application_inscription1_invoker = createInvoker(
    Application_7.inscription(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "inscription",
      Nil,
      "GET",
      """""",
      this.prefix + """inscription"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inscription")))
  )
  private[this] lazy val controllers_Application_create2_invoker = createInvoker(
    Application_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """inscription"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_connexion3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("connexion")))
  )
  private[this] lazy val controllers_Application_connexion3_invoker = createInvoker(
    Application_7.connexion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "connexion",
      Nil,
      "GET",
      """""",
      this.prefix + """connexion"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_authentification4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("connexion")))
  )
  private[this] lazy val controllers_Application_authentification4_invoker = createInvoker(
    Application_7.authentification(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authentification",
      Nil,
      "POST",
      """""",
      this.prefix + """connexion"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_deconnexion5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deconnexion")))
  )
  private[this] lazy val controllers_Application_deconnexion5_invoker = createInvoker(
    Application_7.deconnexion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deconnexion",
      Nil,
      "GET",
      """""",
      this.prefix + """deconnexion"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Newsletters_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsletter")))
  )
  private[this] lazy val controllers_Newsletters_create6_invoker = createInvoker(
    Newsletters_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Newsletters",
      "create",
      Nil,
      "POST",
      """ Newsletter""",
      this.prefix + """newsletter"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Profils_reads7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profil")))
  )
  private[this] lazy val controllers_Profils_reads7_invoker = createInvoker(
    Profils_5.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profils",
      "reads",
      Nil,
      "GET",
      """ Profils""",
      this.prefix + """profil"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Blogs_reads8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs")))
  )
  private[this] lazy val controllers_Blogs_reads8_invoker = createInvoker(
    Blogs_10.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Blogs",
      "reads",
      Nil,
      "GET",
      """ Blog""",
      this.prefix + """blogs"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Blogs_read9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs/"), DynamicPart("lien", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Blogs_read9_invoker = createInvoker(
    Blogs_10.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Blogs",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """blogs/$lien<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Evenements_reads10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evenements")))
  )
  private[this] lazy val controllers_Evenements_reads10_invoker = createInvoker(
    Evenements_1.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Evenements",
      "reads",
      Nil,
      "GET",
      """ Evenement""",
      this.prefix + """evenements"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Evenements_read11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evenements/"), DynamicPart("lien", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Evenements_read11_invoker = createInvoker(
    Evenements_1.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Evenements",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """evenements/$lien<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Startups_reads12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startup")))
  )
  private[this] lazy val controllers_Startups_reads12_invoker = createInvoker(
    Startups_2.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Startups",
      "reads",
      Nil,
      "GET",
      """ Startup""",
      this.prefix + """startup"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Startups_read13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startup/"), DynamicPart("nom", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Startups_read13_invoker = createInvoker(
    Startups_2.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Startups",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """startup/$nom<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Incubateurs_reads14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("incubateur")))
  )
  private[this] lazy val controllers_Incubateurs_reads14_invoker = createInvoker(
    Incubateurs_9.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Incubateurs",
      "reads",
      Nil,
      "GET",
      """ Incubateur""",
      this.prefix + """incubateur"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Mediatheques_reads15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mediatheques")))
  )
  private[this] lazy val controllers_Mediatheques_reads15_invoker = createInvoker(
    Mediatheques_3.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Mediatheques",
      "reads",
      Nil,
      "GET",
      """ Mediatheque""",
      this.prefix + """mediatheques"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Postules_reads16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postule")))
  )
  private[this] lazy val controllers_Postules_reads16_invoker = createInvoker(
    Postules_8.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Postules",
      "reads",
      Nil,
      "GET",
      """ Postule""",
      this.prefix + """postule"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Postules_create17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postule")))
  )
  private[this] lazy val controllers_Postules_create17_invoker = createInvoker(
    Postules_8.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Postules",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """postule"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Contacts_reads18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts")))
  )
  private[this] lazy val controllers_Contacts_reads18_invoker = createInvoker(
    Contacts_4.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "reads",
      Nil,
      "GET",
      """ Contact""",
      this.prefix + """contacts"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Contacts_create19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts")))
  )
  private[this] lazy val controllers_Contacts_create19_invoker = createInvoker(
    Contacts_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """contacts"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_7.index())
      }
  
    // @LINE:7
    case controllers_Application_inscription1_route(params) =>
      call { 
        controllers_Application_inscription1_invoker.call(Application_7.inscription())
      }
  
    // @LINE:8
    case controllers_Application_create2_route(params) =>
      call { 
        controllers_Application_create2_invoker.call(Application_7.create())
      }
  
    // @LINE:10
    case controllers_Application_connexion3_route(params) =>
      call { 
        controllers_Application_connexion3_invoker.call(Application_7.connexion())
      }
  
    // @LINE:11
    case controllers_Application_authentification4_route(params) =>
      call { 
        controllers_Application_authentification4_invoker.call(Application_7.authentification())
      }
  
    // @LINE:13
    case controllers_Application_deconnexion5_route(params) =>
      call { 
        controllers_Application_deconnexion5_invoker.call(Application_7.deconnexion())
      }
  
    // @LINE:16
    case controllers_Newsletters_create6_route(params) =>
      call { 
        controllers_Newsletters_create6_invoker.call(Newsletters_0.create())
      }
  
    // @LINE:19
    case controllers_Profils_reads7_route(params) =>
      call { 
        controllers_Profils_reads7_invoker.call(Profils_5.reads())
      }
  
    // @LINE:22
    case controllers_Blogs_reads8_route(params) =>
      call { 
        controllers_Blogs_reads8_invoker.call(Blogs_10.reads())
      }
  
    // @LINE:23
    case controllers_Blogs_read9_route(params) =>
      call(params.fromPath[String]("lien", None)) { (lien) =>
        controllers_Blogs_read9_invoker.call(Blogs_10.read(lien))
      }
  
    // @LINE:26
    case controllers_Evenements_reads10_route(params) =>
      call { 
        controllers_Evenements_reads10_invoker.call(Evenements_1.reads())
      }
  
    // @LINE:27
    case controllers_Evenements_read11_route(params) =>
      call(params.fromPath[String]("lien", None)) { (lien) =>
        controllers_Evenements_read11_invoker.call(Evenements_1.read(lien))
      }
  
    // @LINE:30
    case controllers_Startups_reads12_route(params) =>
      call { 
        controllers_Startups_reads12_invoker.call(Startups_2.reads())
      }
  
    // @LINE:31
    case controllers_Startups_read13_route(params) =>
      call(params.fromPath[String]("nom", None)) { (nom) =>
        controllers_Startups_read13_invoker.call(Startups_2.read(nom))
      }
  
    // @LINE:34
    case controllers_Incubateurs_reads14_route(params) =>
      call { 
        controllers_Incubateurs_reads14_invoker.call(Incubateurs_9.reads())
      }
  
    // @LINE:37
    case controllers_Mediatheques_reads15_route(params) =>
      call { 
        controllers_Mediatheques_reads15_invoker.call(Mediatheques_3.reads())
      }
  
    // @LINE:40
    case controllers_Postules_reads16_route(params) =>
      call { 
        controllers_Postules_reads16_invoker.call(Postules_8.reads())
      }
  
    // @LINE:41
    case controllers_Postules_create17_route(params) =>
      call { 
        controllers_Postules_create17_invoker.call(Postules_8.create())
      }
  
    // @LINE:44
    case controllers_Contacts_reads18_route(params) =>
      call { 
        controllers_Contacts_reads18_invoker.call(Contacts_4.reads())
      }
  
    // @LINE:45
    case controllers_Contacts_create19_route(params) =>
      call { 
        controllers_Contacts_create19_invoker.call(Contacts_4.create())
      }
  
    // @LINE:50
    case controllers_Assets_versioned20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_6.versioned(path, file))
      }
  }
}