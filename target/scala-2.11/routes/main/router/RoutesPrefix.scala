
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/Desktop/cipmen/conf/routes
// @DATE:Thu Mar 17 17:09:55 WAT 2016


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
