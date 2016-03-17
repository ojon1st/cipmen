
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mediatheques_Scope0 {
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

     object mediatheques_Scope1 {
import java.util

class mediatheques extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Mediatheque],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(mediatheques: util.List[Mediatheque]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""

"""),_display_(/*4.2*/main("Médiathèques")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""

    """),format.raw/*6.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url ( """),_display_(/*6.82*/routes/*6.88*/.Assets.versioned("img/home/header.jpg")),format.raw/*6.128*/(""" """),format.raw/*6.129*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Médiathèque</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">

        <nav class="filters-bar space-bottom-2x">
            <div class="column">
                <ul class="nav-filters">
                    <li class="active">
                        <a href="#" data-filter="*">
                            <i class="pe-7s-keypad"></i>
                            Tout voir
                        </a>
                    </li>
                    <li>
                        <a href="#" data-filter=".image">
                            <i class="pe-7s-photo"></i>
                            Images
                        </a>
                    </li>
                    <li>
                        <a href="#" data-filter=".video">
                            <i class="pe-7s-film"></i>
                            Video
                        </a>
                    </li>
                </ul>
            </div>
            <div class="column"></div>
        </nav>

        <section class="grid isotope-masonry-grid filter-grid">
            <div class="grid-sizer"></div>
            <div class="gutter-sizer"></div>
            """),_display_(/*49.14*/for(mediatheque <- mediatheques) yield /*49.46*/ {_display_(Seq[Any](format.raw/*49.48*/("""
                """),_display_(/*50.18*/if(mediatheque.getType == "video")/*50.52*/ {_display_(Seq[Any](format.raw/*50.54*/("""
                    """),format.raw/*51.21*/("""<div class="grid-item video inspiration">
                        <a href="https://www.youtube.com/watch?v="""),_display_(/*52.67*/mediatheque/*52.78*/.getVideo),format.raw/*52.87*/("""" class="gallery-tile gallery-video">
                            <div class="icon"><i class="pe-7s-film"></i></div>
                            <div class="image" style="background-image: url("""),_display_(/*54.78*/routes/*54.84*/.Assets.versioned("img/mediatheques/"+mediatheque.getImage+".jpg")),format.raw/*54.150*/(""");"></div>
                        </a>
                    </div>
                """)))}),format.raw/*57.18*/("""
                """),_display_(/*58.18*/if(mediatheque.getType == "photo")/*58.52*/ {_display_(Seq[Any](format.raw/*58.54*/("""
                    """),format.raw/*59.21*/("""<div class="grid-item w2 image ux">
                        <a href=""""),_display_(/*60.35*/routes/*60.41*/.Assets.versioned("img/mediatheques/"+mediatheque.getImage+".jpg")),format.raw/*60.107*/("""" class="gallery-tile gallery-image">
                            <div class="icon"><i class="pe-7s-camera"></i></div>
                            <div class="image" style="background-image: url("""),_display_(/*62.78*/routes/*62.84*/.Assets.versioned("img/mediatheques/"+mediatheque.getImage+".jpg")),format.raw/*62.150*/(""");"></div>
                        </a>
                    </div>
                """)))}),format.raw/*65.18*/("""
            """)))}),format.raw/*66.14*/("""
        """),format.raw/*67.9*/("""</section>

    </div>
""")))}),format.raw/*70.2*/("""

"""))
      }
    }
  }

  def render(mediatheques:util.List[Mediatheque]): play.twirl.api.HtmlFormat.Appendable = apply(mediatheques)

  def f:((util.List[Mediatheque]) => play.twirl.api.HtmlFormat.Appendable) = (mediatheques) => apply(mediatheques)

  def ref: this.type = this

}


}
}

/**/
object mediatheques extends mediatheques_Scope0.mediatheques_Scope1.mediatheques
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 17:09:56 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/mediatheques.scala.html
                  HASH: 352252d594077c32e0c51c86c42ea3d4aa9eb1be
                  MATRIX: 827->19|960->57|988->60|1016->80|1055->82|1087->88|1190->165|1204->171|1265->211|1294->212|2801->1692|2849->1724|2889->1726|2934->1744|2977->1778|3017->1780|3066->1801|3201->1909|3221->1920|3251->1929|3472->2123|3487->2129|3575->2195|3690->2279|3735->2297|3778->2331|3818->2333|3867->2354|3964->2424|3979->2430|4067->2496|4290->2692|4305->2698|4393->2764|4508->2848|4553->2862|4589->2871|4643->2895
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|39->6|39->6|82->49|82->49|82->49|83->50|83->50|83->50|84->51|85->52|85->52|85->52|87->54|87->54|87->54|90->57|91->58|91->58|91->58|92->59|93->60|93->60|93->60|95->62|95->62|95->62|98->65|99->66|100->67|103->70
                  -- GENERATED --
              */
          