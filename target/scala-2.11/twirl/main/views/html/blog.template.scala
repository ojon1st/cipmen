
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blog_Scope0 {
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

class blog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Blog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blog : Blog):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Blog")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image: url("""),_display_(/*4.79*/routes/*4.85*/.Assets.versioned("img/home/header6.jpg")),format.raw/*4.126*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .25;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Blog</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="content-no-sidebar padding-bottom">
        <h3>"""),_display_(/*17.14*/blog/*17.18*/.getTitre),format.raw/*17.27*/("""</h3>
        <p>"""),_display_(/*18.13*/blog/*18.17*/.getShortDescription),format.raw/*18.37*/("""</p>

        <div class="image-carousel space-top-2x space-bottom light-controls" data-dots="true" data-autoplay="true" data-interval="3000" >
            <div class="inner">
                <img src=""""),_display_(/*22.28*/routes/*22.34*/.Assets.versioned("img/blogs/"+blog.getImageOne+".jpg")),format.raw/*22.89*/("""" alt="Image">
                <img src=""""),_display_(/*23.28*/routes/*23.34*/.Assets.versioned("img/blogs/"+blog.getImageTwo+".jpg")),format.raw/*23.89*/("""" alt="Image">
                <img src=""""),_display_(/*24.28*/routes/*24.34*/.Assets.versioned("img/blogs/"+blog.getImageTree+".jpg")),format.raw/*24.90*/("""" alt="Image">
            </div>
        </div>
        <p>"""),_display_(/*27.13*/Html(blog.getLongDescription)),format.raw/*27.42*/("""</p>
        """),_display_(/*28.10*/if(blog.getVideo)/*28.27*/{_display_(Seq[Any](format.raw/*28.28*/("""
            """),format.raw/*29.13*/("""<div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
                <iframe src="https://www.youtube.com/embed/"""),_display_(/*30.61*/blog/*30.65*/.getVideo),format.raw/*30.74*/("""" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
            </div>
        """)))}),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""</div>
""")))}))
      }
    }
  }

  def render(blog:Blog): play.twirl.api.HtmlFormat.Appendable = apply(blog)

  def f:((Blog) => play.twirl.api.HtmlFormat.Appendable) = (blog) => apply(blog)

  def ref: this.type = this

}


}

/**/
object blog extends blog_Scope0.blog
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/blog.scala.html
                  HASH: 408f1cc0677edfb739b9d616541c9a4878a2b8be
                  MATRIX: 741->1|849->14|877->17|897->29|935->30|966->35|1066->109|1080->115|1142->156|1576->563|1589->567|1619->576|1664->594|1677->598|1718->618|1948->821|1963->827|2039->882|2108->924|2123->930|2199->985|2268->1027|2283->1033|2360->1089|2448->1150|2498->1179|2539->1193|2565->1210|2604->1211|2645->1224|2815->1367|2828->1371|2858->1380|2991->1482|3023->1487
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|48->17|48->17|48->17|49->18|49->18|49->18|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|63->32|64->33
                  -- GENERATED --
              */
          