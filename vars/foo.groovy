//@Grab('org.apache.commons:commons-math3:3.4.1')
@GrabResolver(name='custom', root='http://localhost:8081/nexus/content/repositories/ivy/', m2Compatible='true')
@Grab('sie.kamaji:jenkins-test:1.1.0')
import SomeLibrary
def parallelize(String s) {
  return SomeLibrary.getStatus(s)
}
