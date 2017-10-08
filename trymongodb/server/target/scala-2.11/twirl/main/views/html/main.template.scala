
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(header: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.46*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        """),format.raw/*15.108*/("""
        """),format.raw/*16.9*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        """),_display_(/*17.10*/header),format.raw/*17.16*/("""
    """),format.raw/*18.5*/("""</head>
    <body>
        """),format.raw/*21.32*/("""
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
        """),format.raw/*23.9*/("""<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
      """),format.raw/*26.105*/("""
    """),format.raw/*27.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,header:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(header)(content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (header) => (content) => apply(title)(header)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Sep 27 22:27:48 CEST 2017
                  SOURCE: /Users/tao/Projet/cookietracker/server/app/views/main.scala.html
                  HASH: 74c3dc725176c3758065b70d6974f8c10f2ce98e
                  MATRIX: 789->260|928->304|956->306|1036->411|1072->420|1107->428|1133->433|1179->654|1215->663|1465->886|1492->892|1524->897|1579->1014|1616->1024|1644->1031|1680->1040|2323->1752|2355->1757
                  LINES: 25->7|30->7|32->9|35->12|36->13|36->13|36->13|37->15|38->16|39->17|39->17|40->18|42->21|43->22|43->22|44->23|47->26|48->27
                  -- GENERATED --
              */
          