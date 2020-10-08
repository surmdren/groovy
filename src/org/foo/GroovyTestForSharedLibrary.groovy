class DownloadCacheUtils {
    static Map injectDownloadCacheInParameters(String script, Map parameters) {
        def foo = 1
         println foo
        // if (!isEnabled(script)){
        //     println "true"
        // }
        return parameters
    }

    static void main(args){
        println "Hello World!"
        String script = "a"
        println script
        def parameters = [name: "Jerry", age: 42, city: "New York"]
        def p = new DownloadCacheUtils()
        parameters = p.injectDownloadCacheInParameters(script, parameters)
        println parameters
    }
}