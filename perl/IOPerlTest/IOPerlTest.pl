use strict;
use warnings;
 
my $filename = 'DataFile.csv';
if (open(my $fh, '<:encoding(UTF-8)', $filename)) {
  	while (my $row = <$fh>) {
    	chomp $row;
  	}
} else {
  	warn "Could not open file '$filename' $!";
}
