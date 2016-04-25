
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object evenement_Scope0 {
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

class evenement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Evenement,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(evenement : Evenement):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Evènement")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*5.80*/routes/*5.86*/.Assets.versioned("img/home/header6.jpg")),format.raw/*5.127*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Evènement</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-lg-9 col-md-8 col-lg-push-3 col-md-push-4">
                <h3>"""),_display_(/*21.22*/evenement/*21.31*/.getTitre),format.raw/*21.40*/("""</h3>
                <p>"""),_display_(/*22.21*/Html(evenement.getShortDescription)),format.raw/*22.56*/("""</p>
                <div class="image-carousel space-top-2x space-bottom light-controls" data-dots="true" data-autoplay="true" data-interval="3000" >
                    <div class="inner">
                        <img src=""""),_display_(/*25.36*/routes/*25.42*/.Assets.versioned("img/evenements/"+evenement.getImageOne+".jpg")),format.raw/*25.107*/("""" alt="Image">
                        <img src=""""),_display_(/*26.36*/routes/*26.42*/.Assets.versioned("img/evenements/"+evenement.getImageTwo+".jpg")),format.raw/*26.107*/("""" alt="Image">
                        <img src=""""),_display_(/*27.36*/routes/*27.42*/.Assets.versioned("img/evenements/"+evenement.getImageTree+".jpg")),format.raw/*27.108*/("""" alt="Image">
                    </div>
                </div>
                <p>"""),_display_(/*30.21*/Html(evenement.getLongDescription)),format.raw/*30.55*/("""</p>
                """),_display_(/*31.18*/if(evenement.getVideo)/*31.40*/{_display_(Seq[Any](format.raw/*31.41*/("""
                    """),format.raw/*32.21*/("""<div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
                        <iframe src="https://www.youtube.com/embed/"""),_display_(/*33.69*/evenement/*33.78*/.getVideo),format.raw/*33.87*/("""" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
                    </div>
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</div>

            <div class="padding-top visible-sm visible-xs"></div>
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

  def render(evenement:Evenement): play.twirl.api.HtmlFormat.Appendable = apply(evenement)

  def f:((Evenement) => play.twirl.api.HtmlFormat.Appendable) = (evenement) => apply(evenement)

  def ref: this.type = this

}


}

/**/
object evenement extends evenement_Scope0.evenement
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/evenement.scala.html
                  HASH: d843d915195f954a3457bba775fcae1cf0bb460c
                  MATRIX: 756->1|874->24|902->27|927->44|965->45|997->51|1098->126|1112->132|1174->173|1714->686|1732->695|1762->704|1815->730|1871->765|2124->991|2139->997|2226->1062|2303->1112|2318->1118|2405->1183|2482->1233|2497->1239|2585->1305|2697->1390|2752->1424|2801->1446|2832->1468|2871->1469|2920->1490|3098->1641|3116->1650|3146->1659|3295->1777|3336->1790
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|52->21|52->21|52->21|53->22|53->22|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|64->33|66->35|67->36
                  -- GENERATED --
              */
          