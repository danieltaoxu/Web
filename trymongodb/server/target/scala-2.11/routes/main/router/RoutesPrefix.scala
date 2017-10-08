
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tao/webcrawler/server/conf/routes
// @DATE:Sun Oct 08 00:08:27 CEST 2017


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
