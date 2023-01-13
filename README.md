
```python

hi, i am Jack/exoad a casual low level & graphics enjoyer :)

i mainly program in C, C++, Java & Elixir.
```

<details close>
<summary>
<code>[ working on ]</code>
</summary>
<br>
<code>public projects:</code>
<br>
<br>

| <code>name</code> | <code>description</code> | <code>link</code> |
| :------: | :-------------: | :------: |
|<code>Halcyon</code>|Native Audio Engine & Player|https://github.com/Halcyoninae/Halcyon.git|
|<code>Yttrius</code>|Multi-paradigm high sugar language|https://github.com/exoad/yttriusSDK|
|<code>question-mark</code>|General Purpose UI Toolkit in Haxe & C++|https://github.com/exoad/question-mark|
|<code>native-util</code>|Low Level System Interface|https://github.com/Exoad4JVM/util.git|
|<code>usaco-mashup-bot</code>|One off project: USACO Mashup Discord Bot|https://github.com/exoad/usaco-mashup-bot.git|

</details>

<details close>
  <summary>
    <code>[ my bad habits ]</code>
  </summary>
  <br>
  This field contains how code is laid out in a source tree for most if not all of my projects
  <br>
  <code>defaults_pkg_naming:</code>
  <br>
  <br>
  <strong>com.jackmeng</strong> --> Java, Kotlin
  <br>
  <strong>pkg.hxjmeng</strong> --> Haxe
  <br>
  <strong>pkg::jmeng</strong> --> C++,Elixir,Dart
  <br>dev
  <br>
  <code>defaults_file_naming:</code>
  <br>
  <br>
  <strong>abc_FileName</strong> --> Java,Haxe,Kotlin,Elixir,Dart
  <br>
  <strong>jm_abc_FileName</strong> --> C/C++
  <br>
  <br>
  <code>Usage File Name Descriptors [abc]:</code>
  
  `use` -> Common prefix for "Usage Dependency" or "Usage Functionalities," which contain primal definitions for certain Object Creation or basic collectivized 
           function groups.<br>
  `impl` -> Commonly seen in JVM languages with `abstract interface` or `abstract class` definitions. Clearly states that this class requires implementation for             proper runtime behaviors.<br>
  `sys` -> Low level syscalls that can be abstracted away either to a native call or implemented on the spot. Most of these codes use some form of platform dependent shared binaries that 
           must be either statically or dynamically linked at runtime (*.so, *.dll, *.dylib)<br>
  `t` -> Suffix commonly used to denote a type definition. For example, my Java stl `com.jackmeng.stl.types.UInt_t` defines an Unsigned Integer type.<br>
  `gui` -> An uncommon prefix used to denote that a certain file is primarily involved in GUI processing and GUI presentation. Should not be confused with GUI
           utility functions.<br>
  `struct` or `st` -> Defines a structure. Similar to a `use` and a `t` when combined, most commonly for defining certain utility structures, like a Pair,                             SetQueue, etc.. Commonly used to define data structures not provided by the language's STL. <br>
  `run` or `rou` -> Defines a routine to run. Most commonly found as a script file or some kind of single one time runnable that performs some bootstrap calls                       before something else can be executed. This could found as a non GNU Makefile written in maybe like BASH.<br>
  `yum` -> Common prefix to represent "assets" or consumables that are to be loaded by a higher level binary during runtime. These files are not statically                linked, instead primarily JIT loaded by some kind of fetcher.<br>
  `const` -> Defines constants, primarily those that are immutable.<br>
  
  </details>
