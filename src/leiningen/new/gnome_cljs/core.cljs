(ns gnome-cljs.core)

;; Have ClojureScript print using gjs's print function.
;; FIXME: Outputs double space.  Need to find a print func without a
;; newline.
(set! cljs.core/string-print js/print)

(println "Starting")

;; Enumerate the available libraries like this:
;; (js* "for (i in imports ) { print(i); }")

;; Load libraries
(def Gtk js/imports.gi.Gtk)
(def TOPLEVEL js/imports.gi.Gtk.WindowType.TOPLEVEL)

;; Helpers
(defn Window [& properties]
  (new js/imports.gi.Gtk.Window (apply js-obj properties)))

(defn Button [& properties]
  (new js/imports.gi.Gtk.Button (apply js-obj properties)))


;; Handlers for Example one
(defn hello [widget]
  (println "Hello world"))

(defn onDeleteEvent [widget, event]
  (println "Delete event occurred")
  false)

(defn onDestroy [widget]
  (println "destroy signal occurred")
  (.main_quit Gtk))

;; Roughly translated from samples/example1.js
(defn example1 []
  (.init Gtk nil)
  (let [win (Window "type" TOPLEVEL)
        button (Button "label" "Hello World"
                       "tooltip_text" "I'm a tool tip!")]

    (doto button
      (.connect "clicked" hello)
      (.connect "clicked" #(.destroy win)))

    (doto win
        (.connect "delete-event" onDeleteEvent)
        (.connect "destroy" onDestroy)
        (.set_border_width 10)
        (.add button)
        (.show_all))

    (.main Gtk)))


;; Example two
(defn onStartup [Application]
  (println "Startup event occured"))

(defn onActivate [Application]
  (println "Startup event occured"))

;; (defn example2 []
;;   ;Not implemented
;;   )

(example1)
;; (example2)

(println "end")

