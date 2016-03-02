
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/cipmen/conf/routes
// @DATE:Wed Mar 02 01:12:29 WAT 2016

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
  Application_6: controllers.Application,
  // @LINE:12
  Profils_4: controllers.Profils,
  // @LINE:16
  Blogs_9: controllers.Blogs,
  // @LINE:20
  Evenements_0: controllers.Evenements,
  // @LINE:24
  Startups_1: controllers.Startups,
  // @LINE:28
  Incubateurs_8: controllers.Incubateurs,
  // @LINE:31
  Mediatheques_2: controllers.Mediatheques,
  // @LINE:34
  Postules_7: controllers.Postules,
  // @LINE:37
  Contacts_3: controllers.Contacts,
  // @LINE:43
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:12
    Profils_4: controllers.Profils,
    // @LINE:16
    Blogs_9: controllers.Blogs,
    // @LINE:20
    Evenements_0: controllers.Evenements,
    // @LINE:24
    Startups_1: controllers.Startups,
    // @LINE:28
    Incubateurs_8: controllers.Incubateurs,
    // @LINE:31
    Mediatheques_2: controllers.Mediatheques,
    // @LINE:34
    Postules_7: controllers.Postules,
    // @LINE:37
    Contacts_3: controllers.Contacts,
    // @LINE:43
    Assets_5: controllers.Assets
  ) = this(errorHandler, Application_6, Profils_4, Blogs_9, Evenements_0, Startups_1, Incubateurs_8, Mediatheques_2, Postules_7, Contacts_3, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Profils_4, Blogs_9, Evenements_0, Startups_1, Incubateurs_8, Mediatheques_2, Postules_7, Contacts_3, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscription""", """controllers.Application.inscription()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """connexion""", """controllers.Application.connexion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deconnexion""", """controllers.Application.deconnexion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profil""", """controllers.Profils.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs""", """controllers.Blogs.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs/$nom<[^/]+>""", """controllers.Blogs.read(nom:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evenements""", """controllers.Evenements.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evenements/$nom<[^/]+>""", """controllers.Evenements.read(nom:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startup""", """controllers.Startups.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startup/$nom<[^/]+>""", """controllers.Startups.read(nom:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """incubateur""", """controllers.Incubateurs.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mediatheques""", """controllers.Mediatheques.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postule""", """controllers.Postules.reads()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts""", """controllers.Contacts.reads()"""),
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
    Application_6.index(),
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
    Application_6.inscription(),
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
  private[this] lazy val controllers_Application_connexion2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("connexion")))
  )
  private[this] lazy val controllers_Application_connexion2_invoker = createInvoker(
    Application_6.connexion(),
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

  // @LINE:9
  private[this] lazy val controllers_Application_deconnexion3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deconnexion")))
  )
  private[this] lazy val controllers_Application_deconnexion3_invoker = createInvoker(
    Application_6.deconnexion(),
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

  // @LINE:12
  private[this] lazy val controllers_Profils_reads4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profil")))
  )
  private[this] lazy val controllers_Profils_reads4_invoker = createInvoker(
    Profils_4.reads(),
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

  // @LINE:16
  private[this] lazy val controllers_Blogs_reads5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs")))
  )
  private[this] lazy val controllers_Blogs_reads5_invoker = createInvoker(
    Blogs_9.reads(),
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

  // @LINE:17
  private[this] lazy val controllers_Blogs_read6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs/"), DynamicPart("nom", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Blogs_read6_invoker = createInvoker(
    Blogs_9.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Blogs",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """blogs/$nom<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Evenements_reads7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evenements")))
  )
  private[this] lazy val controllers_Evenements_reads7_invoker = createInvoker(
    Evenements_0.reads(),
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

  // @LINE:21
  private[this] lazy val controllers_Evenements_read8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evenements/"), DynamicPart("nom", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Evenements_read8_invoker = createInvoker(
    Evenements_0.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Evenements",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """evenements/$nom<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Startups_reads9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startup")))
  )
  private[this] lazy val controllers_Startups_reads9_invoker = createInvoker(
    Startups_1.reads(),
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

  // @LINE:25
  private[this] lazy val controllers_Startups_read10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startup/"), DynamicPart("nom", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Startups_read10_invoker = createInvoker(
    Startups_1.read(fakeValue[String]),
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

  // @LINE:28
  private[this] lazy val controllers_Incubateurs_reads11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("incubateur")))
  )
  private[this] lazy val controllers_Incubateurs_reads11_invoker = createInvoker(
    Incubateurs_8.reads(),
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

  // @LINE:31
  private[this] lazy val controllers_Mediatheques_reads12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mediatheques")))
  )
  private[this] lazy val controllers_Mediatheques_reads12_invoker = createInvoker(
    Mediatheques_2.reads(),
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

  // @LINE:34
  private[this] lazy val controllers_Postules_reads13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postule")))
  )
  private[this] lazy val controllers_Postules_reads13_invoker = createInvoker(
    Postules_7.reads(),
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

  // @LINE:37
  private[this] lazy val controllers_Contacts_reads14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts")))
  )
  private[this] lazy val controllers_Contacts_reads14_invoker = createInvoker(
    Contacts_3.reads(),
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

  // @LINE:43
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_6.index())
      }
  
    // @LINE:7
    case controllers_Application_inscription1_route(params) =>
      call { 
        controllers_Application_inscription1_invoker.call(Application_6.inscription())
      }
  
    // @LINE:8
    case controllers_Application_connexion2_route(params) =>
      call { 
        controllers_Application_connexion2_invoker.call(Application_6.connexion())
      }
  
    // @LINE:9
    case controllers_Application_deconnexion3_route(params) =>
      call { 
        controllers_Application_deconnexion3_invoker.call(Application_6.deconnexion())
      }
  
    // @LINE:12
    case controllers_Profils_reads4_route(params) =>
      call { 
        controllers_Profils_reads4_invoker.call(Profils_4.reads())
      }
  
    // @LINE:16
    case controllers_Blogs_reads5_route(params) =>
      call { 
        controllers_Blogs_reads5_invoker.call(Blogs_9.reads())
      }
  
    // @LINE:17
    case controllers_Blogs_read6_route(params) =>
      call(params.fromPath[String]("nom", None)) { (nom) =>
        controllers_Blogs_read6_invoker.call(Blogs_9.read(nom))
      }
  
    // @LINE:20
    case controllers_Evenements_reads7_route(params) =>
      call { 
        controllers_Evenements_reads7_invoker.call(Evenements_0.reads())
      }
  
    // @LINE:21
    case controllers_Evenements_read8_route(params) =>
      call(params.fromPath[String]("nom", None)) { (nom) =>
        controllers_Evenements_read8_invoker.call(Evenements_0.read(nom))
      }
  
    // @LINE:24
    case controllers_Startups_reads9_route(params) =>
      call { 
        controllers_Startups_reads9_invoker.call(Startups_1.reads())
      }
  
    // @LINE:25
    case controllers_Startups_read10_route(params) =>
      call(params.fromPath[String]("nom", None)) { (nom) =>
        controllers_Startups_read10_invoker.call(Startups_1.read(nom))
      }
  
    // @LINE:28
    case controllers_Incubateurs_reads11_route(params) =>
      call { 
        controllers_Incubateurs_reads11_invoker.call(Incubateurs_8.reads())
      }
  
    // @LINE:31
    case controllers_Mediatheques_reads12_route(params) =>
      call { 
        controllers_Mediatheques_reads12_invoker.call(Mediatheques_2.reads())
      }
  
    // @LINE:34
    case controllers_Postules_reads13_route(params) =>
      call { 
        controllers_Postules_reads13_invoker.call(Postules_7.reads())
      }
  
    // @LINE:37
    case controllers_Contacts_reads14_route(params) =>
      call { 
        controllers_Contacts_reads14_invoker.call(Contacts_3.reads())
      }
  
    // @LINE:43
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_5.versioned(path, file))
      }
  }
}