(defproject ring/ring-servlet "1.2.0-SNAPSHOT"
  :description "Ring servlet utilities."
  :url "https://github.com/ring-clojure/ring"
  :dependencies [[ring/ring-core "1.2.0-SNAPSHOT"]
                 [javax.servlet/servlet-api "2.5"]]
  :profiles
  {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.0-RC1"]]}})
