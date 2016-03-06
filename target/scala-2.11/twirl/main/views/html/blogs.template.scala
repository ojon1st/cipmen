
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

        <div class="page-title pt-dark pt-parallax" style="background-image: url("""),_display_(/*7.83*/routes/*7.89*/.Assets.versioned("img/home/header.jpg")),format.raw/*7.129*/(""");" data-stellar-background-ratio="0.65">
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
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/"""),_display_(/*31.58*/blog/*31.62*/.getLien),format.raw/*31.70*/("""">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/"""),_display_(/*46.73*/blog/*46.77*/.getLien),format.raw/*46.85*/("""">"""),_display_(/*46.88*/blog/*46.92*/.getTitre),format.raw/*46.101*/("""</a></h3>
                                <p>"""),_display_(/*47.37*/Html(blog.getLongDescription)),format.raw/*47.66*/("""</p>
                            </div>
                        </article>
                    </div>
                """)))}),format.raw/*51.18*/("""

            """),format.raw/*53.13*/("""</div>
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
                  DATE: Sat Mar 05 10:19:38 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/blogs.scala.html
                  HASH: 1222accbbc2ece5096b8308c7db6eaabb169ab71
                  MATRIX: 799->19|918->43|946->46|967->59|1005->60|1036->65|1172->175|1186->181|1247->221|1854->801|1888->819|1927->820|1976->841|2187->1025|2200->1029|2229->1037|2269->1050|2284->1056|2361->1111|2582->1305|2595->1309|2624->1317|3539->2205|3552->2209|3581->2217|3611->2220|3624->2224|3655->2233|3728->2279|3778->2308|3928->2427|3970->2441
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|40->7|40->7|40->7|57->24|57->24|57->24|58->25|61->28|61->28|61->28|61->28|61->28|61->28|64->31|64->31|64->31|79->46|79->46|79->46|79->46|79->46|79->46|80->47|80->47|84->51|86->53
                  -- GENERATED --
              */
          