def firstcall(String name, String city){
	sh "echo Hello, My name is ${name} from ${city}"
}
def secondCall(String profile){
	sh "echo He works in ${profile}"

}
