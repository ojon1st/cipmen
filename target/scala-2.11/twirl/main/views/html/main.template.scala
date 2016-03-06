
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>CIPMEN | """),_display_(/*8.26*/title),format.raw/*8.31*/("""</title>

        <meta name="description" content="CIPMEN - Home" />
        <meta name="keywords" content="CIPMEN - CENTRE D'INCUBATION POUR LES PMES DU NIGER - L'entrepreunariat innovant et durable"/>
        <meta name="author" content="Cipmen" />

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

        <link rel="shortcut icon" href=""""),_display_(/*16.42*/routes/*16.48*/.Assets.versioned("favicon.ico")),format.raw/*16.80*/("""" type="image/x-icon">

        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.versioned("css/styles.min.css")),format.raw/*18.67*/("""" rel="stylesheet" media="screen">
        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.versioned("css/colors/color.css")),format.raw/*19.69*/("""" rel="stylesheet" media="screen">

        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA5DLwPPVAz88_k0yO2nmFe7T9k1urQs84"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("js/vendor/modernizr.custom.js")),format.raw/*22.79*/(""""></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("js/vendor/pace.min.js")),format.raw/*23.71*/(""""></script>

    </head>

    <body class="is-preloader parallax">
        <div class="page-wrapper">
            """),_display_(/*29.14*/header()),format.raw/*29.22*/("""

            """),_display_(/*31.14*/content),format.raw/*31.21*/("""

            """),format.raw/*33.13*/("""<a href="#" class="scroll-to-top-btn">
                <i class="icon-arrow-up"></i>
            </a>

            """),_display_(/*37.14*/footer()),format.raw/*37.22*/("""

            """),_display_(/*39.14*/scripts()),format.raw/*39.23*/("""

        """),format.raw/*41.9*/("""</div>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 22:19:51 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/main.scala.html
                  HASH: 3f3d5777f6e84e749109d05dd9272eb8a8837055
                  MATRIX: 748->1|873->31|901->33|1018->124|1043->129|1483->542|1498->548|1551->580|1623->625|1638->631|1698->670|1781->726|1796->732|1858->773|2082->970|2097->976|2168->1026|2229->1060|2244->1066|2307->1108|2449->1223|2478->1231|2520->1246|2548->1253|2590->1267|2733->1383|2762->1391|2804->1406|2834->1415|2871->1425
                  LINES: 27->1|32->1|34->3|39->8|39->8|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|60->29|60->29|62->31|62->31|64->33|68->37|68->37|70->39|70->39|72->41
                  -- GENERATED --
              */
          