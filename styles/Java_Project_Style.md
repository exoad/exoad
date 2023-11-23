# Java Project Styling

This is the official documentation on how most of my **Java projects** are laid out.

> Copyright (C) Jack Meng (exoad) 2023


## Table of Contents

1.  [domain & directories](#domain) - how the general directories are laid out

## "domain"

> Domain refers to the overall structures, from file placement to folder structure.

**Current Package Domain:** `pkg.exoad`

> [!WARNING]
> When using a package created by exoad, most of the times the fully qualified package name will be `pkg.exoad.[project_name]`. However, when this is not the case and you can find classes right under `pkg.exoad`, **please take caution when using these internal packages!**

**Deprecated Package Domain(s):** `com.jackmeng`

> [!NOTE]
> The previous Warning for the `pkg.exoad` domain does not apply here. The classes located right under `com.jackmeng` are mostly just related to my global Java STL extension.

### Project structure

```
- ./
 - pkg
  - exoad
   - [project_name]
 - lib
 - assets
 - docs
 - shared
 - scripts
```

`pkg` - The classpath starting location (sometimes, this folder can be wrapped with `src`)

`lib` - Where statically linked `.jar` are found and loaded (*Sometimes, this is called `requires`*)

`assets` - For any resources the program itself might need, such as icons

`docs` - Generated documentation by a toolchain like JavaDoc or Doxygen. *Most of the time, this directory is for GitHub Pages*

`shared` - Any native libraries that may be dynamically linked (this is not lib!)

`scripts` - Usually workflow scripts and also scripts used for continuous integration


### Common sub-package names

Under the base package, there are some common sub packages you can find and most of them have generalized meanings.

1. `intf` - This subpackage contains interfaces and functional interfaces
2. `util` - Utility classes are placed here
3. `services` - Similar to utility classes but provide more robust APIs and more generalization that can be utilized mostly outside of just the current project. *This is a very new folder type*
4. `core` - Refers to the main part of a project. For apps, this is where an app's content is actually created. However, utilities and other helper functionalities are not located here.
5. `platform` - A package that contains JNI related code
6. `debug` - Code related to logging and producing customized stack traces and panic messages for a program

## "naming"

> My naming conventions have shifted a lot, but most of them still follow the same meaning just with different looks.

> [!WARNING]
> Some of the old conventions I use are not following Java's Standard Coding Conventions

**Prefixed Usage (OLD)**

This format follows prefixing a class (and file) with its intended usage with a commonly recognized prefix.

For example, a utility class:

```java
public final class Printer
{
      public static void print(String ch)
      {
            System.out.print(ch);
      }
}
```

would be refactored to `use_Printer` (the file would be `use_Printer.java`).

The `use` is a common prefix for some kind of utility class in this case.

All prefixes:

`[prefix]_ClassName.java`

1. `use` - utility
2. `impl` - Abstract or interface
3. `gui` - Usually referring to a graphical element (Swing)
4. `dgui` - Refers to a graphical element that cannot be displayed on its own and requires a `gui` or parent graphical element
5. `stx` - References some sort of data structure
6. `stl` - *This was only used in my old Java STL extension (com.jackmeng)*
7. `const` - Refers to a single class that holds either Shared (internal) or Public constants for the program
8. `sys` - Usually refers to a JNI bound class
9. `evnt` - Just another version of `impl` that is specifically targetted towards the MVC arch.
10. `has` - Signifies that this class is an annotation
11. `jm` - Only found in a few projects, but usually signifies the only entrypoint that is VALID for a project
12. `extend` - Often used to signify that an utility class has its main purpose towards being a mixin of a more concrete class
13. `ui` - A later reuse of `dgui`
14. `ux` - Used to signify that this part is strictly attached to a graphical element to handle logical operations
