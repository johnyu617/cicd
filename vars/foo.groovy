//@Grab('org.apache.commons:commons-math3:3.4.1')
@GrabResolver(name='custom', root='http://192.168.1.194:8081/nexus/content/repositories/jun-test-repo-id/', m2Compatible='true')
@Grab('sie:jenkins-test:1.1.1')
import SomeLibrary
def parallelize(String s) {
  return SomeLibrary.getStatus(s)
}
