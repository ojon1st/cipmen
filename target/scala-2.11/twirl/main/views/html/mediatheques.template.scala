
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

    """),format.raw/*6.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*6.80*/routes/*6.86*/.Assets.versioned("img/home/header6.jpg")),format.raw/*6.127*/(""" """),format.raw/*6.128*/(""") ;" data-stellar-background-ratio="0.65">
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
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/mediatheques.scala.html
                  HASH: c97fc36d19b01b8e4b91c5f1387130fdbee6284b
                  MATRIX: 827->19|960->57|988->60|1016->80|1055->82|1087->88|1188->163|1202->169|1264->210|1293->211|2800->1691|2848->1723|2888->1725|2933->1743|2976->1777|3016->1779|3065->1800|3200->1908|3220->1919|3250->1928|3471->2122|3486->2128|3574->2194|3689->2278|3734->2296|3777->2330|3817->2332|3866->2353|3963->2423|3978->2429|4066->2495|4289->2691|4304->2697|4392->2763|4507->2847|4552->2861|4588->2870|4642->2894
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|39->6|39->6|82->49|82->49|82->49|83->50|83->50|83->50|84->51|85->52|85->52|85->52|87->54|87->54|87->54|90->57|91->58|91->58|91->58|92->59|93->60|93->60|93->60|95->62|95->62|95->62|98->65|99->66|100->67|103->70
                  -- GENERATED --
              */
          