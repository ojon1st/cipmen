
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blogs_Scope0 {
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

     object blogs_Scope1 {
import java.util

class blogs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Blog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(blogs: util.List[Blog]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.26*/("""

"""),_display_(/*4.2*/main("Blogs")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    """),format.raw/*5.5*/("""<div class="page-wrapper">

        <div class="page-title pt-dark pt-parallax" style="background-image: url("""),_display_(/*7.83*/routes/*7.89*/.Assets.versioned("img/home/header6.jpg")),format.raw/*7.130*/(""");" data-stellar-background-ratio="0.65">
            <span class="overlay" style="opacity :.25 ;"></span>
            <div class="container">
                <div class="inner">
                    <div class="title">
                        <h2 class="text-light"><strong>Blogs</strong></h2>
                    </div>

                </div>
            </div>
        </div>

        <section class="container">
            <div class="grid isotope-grid col-3">
                <div class="grid-sizer"></div>
                <div class="gutter-sizer"></div>

                """),_display_(/*24.18*/for(blog <- blogs) yield /*24.36*/{_display_(Seq[Any](format.raw/*24.37*/("""
                    """),format.raw/*25.21*/("""<div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/"""),_display_(/*28.50*/blog/*28.54*/.getLien),format.raw/*28.62*/(""""><img src=""""),_display_(/*28.75*/routes/*28.81*/.Assets.versioned("img/blogs/"+blog.getImageOne+".jpg")),format.raw/*28.136*/("""" alt="Post 2"></a>
                            </div>
                            <div class="tile-body post-body">
                                <div class="post-format"></div>
                                <h3 class="post-title"><a href="/blogs/"""),_display_(/*32.73*/blog/*32.77*/.getLien),format.raw/*32.85*/("""">"""),_display_(/*32.88*/blog/*32.92*/.getTitre),format.raw/*32.101*/("""</a></h3>
                                <p>"""),_display_(/*33.37*/Html(blog.getShortDescription)),format.raw/*33.67*/("""</p>
                            </div>
                        </article>
                    </div>
                """)))}),format.raw/*37.18*/("""

            """),format.raw/*39.13*/("""</div>
        </section>

    </div>
""")))}))
      }
    }
  }

  def render(blogs:util.List[Blog]): play.twirl.api.HtmlFormat.Appendable = apply(blogs)

  def f:((util.List[Blog]) => play.twirl.api.HtmlFormat.Appendable) = (blogs) => apply(blogs)

  def ref: this.type = this

}


}
}

/**/
object blogs extends blogs_Scope0.blogs_Scope1.blogs
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/blogs.scala.html
                  HASH: 9daa592b5be146441523ae463f0c39d494c65e15
                  MATRIX: 799->19|918->43|946->46|967->59|1005->60|1036->65|1172->175|1186->181|1248->222|1855->802|1889->820|1928->821|1977->842|2188->1026|2201->1030|2230->1038|2270->1051|2285->1057|2362->1112|2642->1365|2655->1369|2684->1377|2714->1380|2727->1384|2758->1393|2831->1439|2882->1469|3032->1588|3074->1602
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|40->7|40->7|40->7|57->24|57->24|57->24|58->25|61->28|61->28|61->28|61->28|61->28|61->28|65->32|65->32|65->32|65->32|65->32|65->32|66->33|66->33|70->37|72->39
                  -- GENERATED --
              */
          