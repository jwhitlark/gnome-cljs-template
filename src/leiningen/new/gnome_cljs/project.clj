(defproject gnome-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: A native Gnome3 ClojureScript app."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                [org.clojure/clojurescript "0.0-1424"]]

  :plugins [[lein-cljsbuild "0.2.3"]
            ;; [lein-gnome "0.1.0-SNAPSHOT"] ; Not available yet.
  ]

  :cljsbuild {:builds [{
                        :source-path "src/cljs"
                        :compiler {
                                   :output-to "resources/main.js"
                                   :optimizations :whitespace
                                   ;; :optimizations :simple
                                   ;; :optimizations :advanced
                                   :pretty-print true
                                   :externs ["externs/gnome_externs.js"]
                                   }
                        }]}
)
