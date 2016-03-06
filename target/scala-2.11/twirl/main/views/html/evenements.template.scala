
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
    """),format.raw/*4.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*4.80*/routes/*4.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*4.126*/(""");" data-stellar-background-ratio="0.65">
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
                        <div class="post-meta">
                            <span class="post-date">
                                <a href="/evenements/"""),_display_(/*25.55*/evenement/*25.64*/.getLien),format.raw/*25.72*/("""">15 février 2016</a>
                            </span>
                        </div>
                        <div class="post-share-btn">
                            <div class="share-dropup">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                            </div>
                            <a href="#"><i class="pe-7s-share"></i></a>
                        </div>
                    </div>
                    <div class="tile-body post-body">
                        <div class="post-format"></div>
                        <h3 class="post-title"><a href="/evenements/"""),_display_(/*39.70*/evenement/*39.79*/.getLien),format.raw/*39.87*/("""">"""),_display_(/*39.90*/evenement/*39.99*/.getTitre),format.raw/*39.108*/("""</a></h3>
                        <p>"""),_display_(/*40.29*/Html(evenement.getShortDescription)),format.raw/*40.64*/("""</p>
                    </div>
                </article>
            """)))}),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""</div>

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
                  DATE: Sat Mar 05 22:51:43 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/evenements.scala.html
                  HASH: 4311c3f1898b377f7099b9362520d75b36d5c416
                  MATRIX: 764->1|888->30|916->33|942->51|980->52|1011->57|1112->132|1126->138|1187->178|1745->709|1789->737|1828->738|1873->755|2025->880|2043->889|2072->897|2112->910|2127->916|2214->981|2416->1156|2434->1165|2463->1173|3270->1953|3288->1962|3317->1970|3347->1973|3365->1982|3396->1991|3461->2029|3517->2064|3620->2136|3661->2149
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|50->19|50->19|50->19|51->20|53->22|53->22|53->22|53->22|53->22|53->22|56->25|56->25|56->25|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|74->43|75->44
                  -- GENERATED --
              */
          