
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
    """),format.raw/*4.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image: url("""),_display_(/*4.79*/routes/*4.85*/.Assets.versioned("img/home/header.jpg")),format.raw/*4.125*/(""");" data-stellar-background-ratio="0.65">
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
        <div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
            <iframe src="https://www.youtube.com/embed/"""),_display_(/*29.57*/blog/*29.61*/.getVideo),format.raw/*29.70*/("""" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
        </div>
    </div>
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
                  DATE: Thu Mar 17 17:09:55 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/blog.scala.html
                  HASH: 2be7d45acdbb5c14fbe3964ef760072ee7713c05
                  MATRIX: 741->1|849->14|877->17|897->29|935->30|966->35|1066->109|1080->115|1141->155|1575->562|1588->566|1618->575|1663->593|1676->597|1717->617|1947->820|1962->826|2038->881|2107->923|2122->929|2198->984|2267->1026|2282->1032|2359->1088|2447->1149|2497->1178|2676->1330|2689->1334|2719->1343
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|48->17|48->17|48->17|49->18|49->18|49->18|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|60->29|60->29|60->29
                  -- GENERATED --
              */
          