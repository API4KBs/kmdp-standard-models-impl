# kmdp-standards-models
##Release Instructions

Affected variables:
* project.parent.version
* project.version (SELF)


### Release Branch
1. Set root POM's version and parent.version to desired fixed version
  * The version MUST match the ${kmdp.standards.version} variable in the BOM

### Nex Dev Branch
1. Set ROOT parent and project to the next desired version
2. Resync each child module's parent project version
