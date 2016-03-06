
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/cipmen/conf/routes
// @DATE:Sun Mar 06 00:49:10 WAT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
