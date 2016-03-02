
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/cipmen/conf/routes
// @DATE:Wed Mar 02 01:12:29 WAT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:43
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseProfils(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profils.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profil"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def deconnexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deconnexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deconnexion"})
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
  
    // @LINE:8
    def connexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.connexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "connexion"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReversePostules(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Postules.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postule"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseStartups(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.read",
      """
        function(nom) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nom", encodeURIComponent(nom))})
        }
      """
    )
  
    // @LINE:24
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Startups.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startup"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseEvenements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.read",
      """
        function(nom) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nom", encodeURIComponent(nom))})
        }
      """
    )
  
    // @LINE:20
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Evenements.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evenements"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseBlogs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.read",
      """
        function(nom) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nom", encodeURIComponent(nom))})
        }
      """
    )
  
    // @LINE:16
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Blogs.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseMediatheques(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Mediatheques.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatheques"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseContacts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Contacts.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseIncubateurs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
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