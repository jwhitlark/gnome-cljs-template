(ns leiningen.new.gnome-cljs
  (:use [leiningen.new.templates :only [renderer year name-to-path ->files
                                        sanitize-ns]]))

(def render (renderer "gnome-cljs"))

(defn gnome-cljs
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :namespace (sanitize-ns name)
              :nested-dirs (name-to-path name)
              :year (year)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             ["samples/example1.js" (render "example1.js" data)]
             ["resources/externs/gnome_externs.js" (render "gnome_externs.js" data)]
             ["src/cljs/{{nested-dirs}}/core.cljs" (render "core.clj" data)]
             )))
