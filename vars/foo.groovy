@GrabResolver(name='restlet', root='http://localhost:8081/nexus/content/repositories/jun-test-repo-id/')
@Grab(group='sie.kamaji', module='jenkins-test', version='1.0.1')
import SomeLibrary

def s = SomeLibrary.getStatus("test status")
echo ${s}
