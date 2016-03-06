
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/cipmen/conf/routes
// @DATE:Sun Mar 06 00:49:10 WAT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:51
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseProfils(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profils.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profil"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseNewsletters(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Newsletters.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newsletter"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def authentification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authentification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "connexion"})
        }
      """
    )
  
    // @LINE:8
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
        }
      """
    )
  
    // @LINE:10
    def connexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.connexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "connexion"})
        }
      """
    )
  
    // @LINE:7
    def inscription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.inscription",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def deconnexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deconnexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deconnexion"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReversePostules(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Postules.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postule"})
        }
      """
    )
  
    // @LINE:41
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Postules.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postule"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseStartups(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.read",
      """
        function(nom) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nom", encodeURIComponent(nom))})
        }
      """
    )
  
    // @LINE:31
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseEvenements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.read",
      """
        function(lien) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lien", encodeURIComponent(lien))})
        }
      """
    )
  
    // @LINE:27
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseBlogs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.read",
      """
        function(lien) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lien", encodeURIComponent(lien))})
        }
      """
    )
  
    // @LINE:23
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseMediatheques(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Mediatheques.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatheques"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseContacts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Contacts.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
    // @LINE:45
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Contacts.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseIncubateurs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Incubateurs.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "incubateur"})
        }
      """
    )
  
  }


}