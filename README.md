# Skadi
Skadi is a tool to create nondeterministic finite automatons (NFA) from regular expressions.
Action code can be attached to transitions and will be executed when that transition occurs.
The code generated from the regular expression will be embedded in a snipped of host code provided by the user.
In this regard Skadi is similar to Flex or Ragel but those tools create *deterministic* automatons.
*Nondeterministic* automatons are ill suited for execution in software but their smaller size makes execution on hardware like FPGAs interesting where multiple states can be evaluated in parallel.
The primary target of Skadi is thus the generation of VHDL code, while a Java target exists mostly for easier evaluation during development of automatons.

Skadi defines its own input file format as shown in the examples folder.
Only a subset of common regular expressions is supported.
Advanced features, that are at odds with a pure automaton implementation, are not supported.
This includes backreferences as an example.

Apart from the code generation Skadi can output a DOT file of the input automatons to generate a graphical representation with Graphviz tools.
Running Skadi without any arguments will print a command reference.

## Building
Skadi is a regular Maven project and building it works as usual.

## Performance
During evaluation on an AMD Virtex UltraScale FPGA Skadi created regex matching engines with state of the art performance of about 10 Gbit/s for the Snort ruleset.
This does however require processing multiple bytes in a single clock cycle as shown in the "multipass" example.
