(defproject org.dunaj/tools.analyzer "0.6.6-dunaj_pre3"
  :description "An analyzer for Clojure code, written in Clojure and producing AST in EDN."
  :url "https://github.com/dunaj/tools.analyzer"
  :scm {:name "git" :url "https://github.com/dunaj-project/tools.analyzer"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "6A72CBE2"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [#_[org.clojure/clojure "1.7.0-alpha5"]
                 #_[com.datomic/datomic-free "0.9.5067" :scope "provided" :exclusions [joda-time]]])
