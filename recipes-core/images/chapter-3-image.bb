

SUMMARY = "Chapter II part 3"
LICENSE = "MIT"
inherit core-image

inherit extrausers
EXTRA_USERS_PARAMS += 'usermod -p '\$5\$GXWuuigS\$fcRncVPUn5uT1dVYdKCWruHHnuf7z4Jpdjbo9kw6r0A' root;'
EXTRA_USERS_PARAMS += 'useradd -p '\$5\$W1wP3Vlt\$JsLmymCVcThF6Y5aL2rZoxFjDSE7svmPadW7D8XaY77' guest;'


IMAGE_INSTALL:append = " gdbserver"
IMAGE_INSTALL:append = " strace"
IMAGE_INSTALL:append = " valgrind"

IMAGE_INSTALL:append = " nano"
IMAGE_INSTALL:append = " apache2"

IMAGE_FEATURES += "read-only-rootfs"

IMAGE_INSTALL:append = " kernel-modules"
