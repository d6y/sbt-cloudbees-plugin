import sbt._

class CloudBeesPlugin(info: ProjectInfo) extends PluginProject(info){ // with posterous.Publish {
  // repositories
  // val beesRepo = "stax.repo" at "http://repository-cloudbees.forge.cloudbees.com/public-snapshot/"
  val specsRepo = "specs.repo" at "http://specs.googlecode.com/svn/maven2/"
  val sonatypeRepo = "sonatype.repo" at "https://oss.sonatype.org/content/groups/public"
  
  // dependencies
  // val apiclient = "net.stax" % "stax-api-client" % "1.0.20110131-SNAPSHOT" % "compile"
  // val appserver = "net.stax" % "stax-appserver" % "1.0.20110131-SNAPSHOT" % "compile"
  // val stax = "stax" % "stax-api" % "1.0.1" % "compile"
  // val xstream = "com.thoughtworks.xstream" % "xstream" % "1.3" % "compile"
  // val httpclient = "commons-httpclient" % "commons-httpclient" % "3.1" % "compile"
  // val jetison = "org.codehaus.jettison" % "jettison" % "1.0.1" % "compile"
  val cbclient = "com.cloudbees" % "cloudbees-api-client-nodeps" % "1.0.0-SNAPSHOT" % "compile"
  
  // testing
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.1" % "test->default"
  
  // repository config for publishing
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
}
