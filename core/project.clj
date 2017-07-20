(defproject ursprung "0.1.0-SNAPSHOT"
  :description "platform that provides replikativ peers and logging"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16" :scope "provided"]
                 [io.replikativ/superv.async "0.2.9"]
                 [io.replikativ/konserve "0.4.9"]
                 [io.replikativ/replikativ "0.2.4"]
                 [com.fzakaria/slf4j-timbre "0.3.5"]
                 [http-kit "2.2.0"]
                 [compojure "1.5.2"]]
  :main ursprung.core
  :jvm-opts ["-Xmx512m" "-server"]
  :profiles {:dev {:dependencies [[com.fzakaria/slf4j-timbre "0.3.5"]]}})
