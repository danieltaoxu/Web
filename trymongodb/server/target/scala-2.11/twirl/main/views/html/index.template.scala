
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<style>
    #graph-container """),format.raw/*5.22*/("""{"""),format.raw/*5.23*/("""
        """),format.raw/*6.9*/("""width: 100%;
        height: 500px;
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""

"""),format.raw/*10.1*/("""</style>
<script src='"""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("javascripts/sigma/sigma.min.js")),format.raw/*11.72*/("""'></script>
""")))}/*12.2*/{_display_(Seq[Any](format.raw/*12.3*/("""
"""),format.raw/*13.1*/("""<h1>Welcome to Play!</h1>
<input type="button" onclick="sendMessage()" value="send message"/>
<div id="graph-container"></div>
<script>
    // Let's first initialize sigma:
    var s = new sigma('graph-container');

    // Then, let's add some data to display:
    s.graph.addNode("""),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
      """),format.raw/*22.7*/("""// Main attributes:
      id: 'n0',
      label: 'Hello',
      // Display attributes:
      x: 0,
      y: 0,
      size: 1,
      color: '#f00'
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/(""").addNode("""),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""
      """),format.raw/*31.7*/("""// Main attributes:
      id: 'n1',
      label: 'World !',
      // Display attributes:
      x: 1,
      y: 1,
      size: 1,
      color: '#00f'
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/(""").addEdge("""),format.raw/*39.16*/("""{"""),format.raw/*39.17*/("""
      """),format.raw/*40.7*/("""id: 'e0',
      // Reference extremities:
      source: 'n0',
      target: 'n1'
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/(""");

    // Finally, let's ask our sigma instance to refresh:
    s.refresh();

</script>
<script type="text/javascript">
            var webSocket = new WebSocket(""""),_display_(/*51.45*/routes/*51.51*/.HomeController.socket().webSocketURL()),format.raw/*51.90*/("""")

            webSocket.onopen = function()"""),format.raw/*53.42*/("""{"""),format.raw/*53.43*/("""
                """),format.raw/*54.17*/("""console.log("The socket is connected.")
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""

            """),format.raw/*57.13*/("""webSocket.onmessage = function (event) """),format.raw/*57.52*/("""{"""),format.raw/*57.53*/("""
                """),format.raw/*58.17*/("""console.log(event.data)
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""

            """),format.raw/*61.13*/("""function sendMessage() """),format.raw/*61.36*/("""{"""),format.raw/*61.37*/("""
                """),format.raw/*62.17*/("""var msg = """),format.raw/*62.27*/("""{"""),format.raw/*62.28*/("""
                    """),format.raw/*63.21*/("""message: "hello"
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/("""

                """),format.raw/*66.17*/("""webSocket.send(JSON.stringify(msg))
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
"""),format.raw/*68.1*/("""</script>
""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Sep 27 00:04:09 CEST 2017
                  SOURCE: /Users/tao/Projet/cookietracker/server/app/views/index.scala.html
                  HASH: 417aa41b6e32dddf8bf691ffd1323d9ce0baa334
                  MATRIX: 534->1|664->36|692->39|723->62|761->63|788->64|844->93|872->94|907->103|973->143|1000->144|1029->146|1079->169|1094->175|1166->226|1197->239|1235->240|1263->241|1572->522|1601->523|1635->530|1812->680|1840->681|1878->691|1907->692|1941->699|2120->851|2148->852|2186->862|2215->863|2249->870|2361->955|2389->956|2581->1121|2596->1127|2656->1166|2729->1211|2758->1212|2803->1229|2883->1281|2912->1282|2954->1296|3021->1335|3050->1336|3095->1353|3159->1389|3188->1390|3230->1404|3281->1427|3310->1428|3355->1445|3393->1455|3422->1456|3471->1477|3532->1510|3561->1511|3607->1529|3683->1577|3712->1578|3740->1579|3781->1590
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|30->6|32->8|32->8|34->10|35->11|35->11|35->11|36->12|36->12|37->13|45->21|45->21|46->22|54->30|54->30|54->30|54->30|55->31|63->39|63->39|63->39|63->39|64->40|68->44|68->44|75->51|75->51|75->51|77->53|77->53|78->54|79->55|79->55|81->57|81->57|81->57|82->58|83->59|83->59|85->61|85->61|85->61|86->62|86->62|86->62|87->63|88->64|88->64|90->66|91->67|91->67|92->68|93->69
                  -- GENERATED --
              */
          