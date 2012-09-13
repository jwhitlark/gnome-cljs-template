# lein-gnome

A Leiningen template for using ClojureScript to build native Gnome3
applications.

## Status - Minimal example code, no build process

## Libraries required (Ubuntu)

Fixme: verify/update details.

 - build-essential
 - gjs (dev?)
 - ???

## TODO

 - Add default icon to resources/icons
 - Minimal Desktop file
 - Other packaging files?

## Reference

### Gnome Javascript engine and bindings page
https://live.gnome.org/Gjs

### Gnome Javascript examples
http://git.gnome.org/browse/gjs/tree/examples

gtk.js is the first one I successfully translated.

### Tutorials for just about everything javascript on Gnome
http://developer.gnome.org/gnome-devel-demos/3.5/js.html.en

### Best Code References I've found
http://www.roojs.com/seed/gir-1.2-gtk-3.0/gjs/Gtk.Application.html

### Blog post exposing some dark corners
https://cannonerd.wordpress.com/2012/01/11/javascript-and-gnome-3-referring-to-files-and-asynchronous-http-requests-using-async-libsoup/

## Notes

There are two Javascript bindings to gnome.  gjs based on Mozilla
SpiderMonkey, and seed based of Webkit.  See
https://live.gnome.org/GObjectIntrospection/BindingsDocumentation for
more details.

Note that some of the above documentation is from seed projects, and
so isn't quite what we need, (I'm assuming gjs, for the moment), but
is very close.  Be aware.

## License

Copyright © 2012 Jason Whitlark(jason@whitlark.org)

Distributed under the Eclipse Public License, the same as Clojure.


