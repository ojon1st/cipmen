
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/Desktop/cipmen/conf/routes
// @DATE:Mon Apr 25 02:51:24 WAT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:50
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
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

  // @LINE:40
  class ReversePostules(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Postules.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postule"})
        }
      """
    )
  
    // @LINE:40
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Postules.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postule"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseStartups(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.read",
      """
        function(nom) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nom", encodeURIComponent(nom))})
        }
      """
    )
  
    // @LINE:30
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseEvenements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.read",
      """
        function(lien) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lien", encodeURIComponent(lien))})
        }
      """
    )
  
    // @LINE:26
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseBlogs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.read",
      """
        function(lien) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lien", encodeURIComponent(lien))})
        }
      """
    )
  
    // @LINE:22
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseMediatheques(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Mediatheques.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatheques"})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseContacts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Contacts.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
    // @LINE:44
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Contacts.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseIncubateurs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
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