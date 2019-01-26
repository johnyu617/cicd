@GrabResolver(name='jun-nexus', root='http://localhost:8081/nexus/content/repositories/jun-test-repo-id/')
@Grab(group='sie.kamaji', module='jenkins-test', version='1.0.2')
import SomeLibrary
def call(){
  def s = SomeLibrary.getStatus("test status")
  return s
}

