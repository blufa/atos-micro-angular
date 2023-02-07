
export interface User {
  id?: number|null;
  firstName : string;
  lastName: string;
  email: string;
  password?: string;
  profile_path?: string;
  created_at?: string;
  updated_at?: string;
}

//export type UserList = PaginatedList<User>;

