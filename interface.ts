type User = {};

type PostType = 'dyi' | 'tutorial' | 'event' | 'post' | 'stats' | 'competition' | 'equipment' | 'product' | 'challenge' | 'pool' ;

type House = 'tête brûlée' | 'chill' | 'freestyle' | '...';

type Comment = {};

type Like = {};

type Location = {};

type Tag = {};

export interface Post {
  title: string;
  description: string;
  tags: Tag[];
  creator: User;
  postedAt: Date;
  type: PostType;
  houses: House[];
  comments: Comment[];
  likes: Like[];
  hotness: any;
  location: Location;
}
