
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object evenements_Scope0 {
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

class evenements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Evenement],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(evenements: List[Evenement]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Evènements")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*4.80*/routes/*4.86*/.Assets.versioned("img/home/header6.jpg")),format.raw/*4.127*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Nos évènements</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">
            <div class="col-lg-9 col-md-8 col-sm-7 col-lg-push-3 col-md-push-4 col-sm-push-5">
            """),_display_(/*19.14*/for(evenement <- evenements) yield /*19.42*/{_display_(Seq[Any](format.raw/*19.43*/("""
                """),format.raw/*20.17*/("""<article class="tile post-tile ">
                    <div class="post-thumb">
                        <a href="/evenements/"""),_display_(/*22.47*/evenement/*22.56*/.getLien),format.raw/*22.64*/(""""><img src=""""),_display_(/*22.77*/routes/*22.83*/.Assets.versioned("img/evenements/"+evenement.getImageOne+".jpg")),format.raw/*22.148*/("""" alt="Post 1"></a>
                    </div>
                    <div class="tile-body post-body">
                        <div class="post-format"></div>
                        <h3 class="post-title"><a href="/evenements/"""),_display_(/*26.70*/evenement/*26.79*/.getLien),format.raw/*26.87*/("""">"""),_display_(/*26.90*/evenement/*26.99*/.getTitre),format.raw/*26.108*/("""</a></h3>
                        <p>"""),_display_(/*27.29*/Html(evenement.getShortDescription)),format.raw/*27.64*/("""</p>
                    </div>
                </article>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""</div>

            <div class="padding-top visible-xs"></div>
            <div class="col-lg-3 col-md-4 col-sm-5 col-lg-pull-9 col-md-pull-8 col-sm-pull-7">
                <aside class="sidebar space-bottom">

                    <section class="widget widget_tags">
                        <h3 class="widget-title">
                            <i class="pe-7s-ticket"></i>
                            Tags
                        </h3>
                        <a href="#" class="tag">Environnement<span>5</span></a>
                        <a href="#" class="tag">Energie<span>123</span></a>
                        <a href="#" class="tag">Solaire<span>9</span></a>
                        <a href="#" class="tag">Android<span>46</span></a>
                        <a href="#" class="tag">Nature<span>77</span></a>
                        <a href="#" class="tag">Informatique<span>184</span></a>
                        <a href="#" class="tag">Development TIC<span>16</span></a>
                    </section>
                </aside>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(evenements:List[Evenement]): play.twirl.api.HtmlFormat.Appendable = apply(evenements)

  def f:((List[Evenement]) => play.twirl.api.HtmlFormat.Appendable) = (evenements) => apply(evenements)

  def ref: this.type = this

}


}

/**/
object evenements extends evenements_Scope0.evenements
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:25 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/evenements.scala.html
                  HASH: e9508bbd9798c6cfcbead8cfd6a432d26d9de733
                  MATRIX: 764->1|888->30|916->33|942->51|980->52|1011->57|1112->132|1126->138|1188->179|1747->711|1791->739|1830->740|1875->757|2027->882|2045->891|2074->899|2114->912|2129->918|2216->983|2469->1209|2487->1218|2516->1226|2546->1229|2564->1238|2595->1247|2660->1285|2716->1320|2819->1392|2860->1405
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|50->19|50->19|50->19|51->20|53->22|53->22|53->22|53->22|53->22|53->22|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|61->30|62->31
                  -- GENERATED --
              */
          